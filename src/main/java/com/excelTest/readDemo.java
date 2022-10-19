package com.excelTest;

import com.alibaba.excel.EasyExcel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class readDemo {
    public static void main(String[] args) {
        String fileName = ".//DataTest//caseData.xlsx";
        String sheetName = "Sheet1";

        String[][] strings = test2(read(fileName, sheetName));
        System.out.println(Arrays.deepToString(strings));

    }
    @DataProvider(name = "strings")
    public Object[][] data(){
        String fileName = ".//DataTest//caseData.xlsx";
        String sheetName = "Sheet1";
        return test2(read(fileName, sheetName));
    }
    @Test(dataProvider = "strings")
    public void test11(String a1,String a2,String a3,String a4,String a5,String a6,String a7,String a8,String a9,String a10,String a11,String a12){
        System.out.println(a1+"  "+a2+"  "+a3+"  "+a4+"  "+a5+"  "+a6+"  "+a7+"  "+a8+"  "+a9+"  "+a10+"  "+a11+"  "+a12);
    }

    public static List<excelDemo> read(String fileName, String sheetName) {
        /*
         * @Description 进行excel文件的读取操作，并将读取到的内容对象存储至一个list集合中
         * @Params  文件名称、sheet页名称
         * @Return 返回集合list
         */
        return EasyExcel.read(fileName, excelDemo.class, new listenerDemo()).sheet(sheetName).doReadSync();
    }

    //    获取返回集合，根据集合中对象获取其对应的变量值，以及对应的属性值
    public static String[][] test2(List<excelDemo> read) {
        int length = excelDemo.class.getDeclaredFields().length;
        int size = read.size();
        String[][] arr = new String[size][length];
        for (int i = 0; i < size; i++) {
            excelDemo demo = read.get(i);
            Field[] fields = demo.getClass().getDeclaredFields();
            try {
                for (int j = 0; j < fields.length; j++) {
                    Field field = fields[j];
                    field.setAccessible(true);
                    String o = (String) field.get(demo);
                    if (o != null) {
                        arr[i][j] = o;
                    } else {
                        arr[i][j] = "";
                    }
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return arr;
    }
}
