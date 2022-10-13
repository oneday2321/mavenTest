package com.excelTest;

import com.alibaba.excel.EasyExcel;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class readDemo {
    public static void main(String[] args) {
        String fileName = ".//DataTest//caseData.xlsx";
        String sheetName = "Sheet1";

//        test1(fileName,sheetName);
        String[][] strings = test2(read(fileName, sheetName));
        System.out.println(Arrays.toString(strings));

    }
    public static List<excelDemo> read(String fileName, String sheetName){
        /*
        * @Description 进行excel文件的读取操作，并将读取到的内容对象存储至一个list集合中
        * @Params  文件名称、sheet页名称
        * @Return 返回集合list
        */
        return EasyExcel.read(fileName, excelDemo.class,new listenerDemo()).sheet(sheetName).doReadSync();
    }

    public static HashMap<Integer, excelDemo> mapExcelCreate(String fileName, String sheetName){
        /*
        * @Description 将excel对象集合存放至一个map中
        * @Params  文件名称、sheet页名称
        * @Return 返回map， 序号，excelDemo对象
        */
        List<excelDemo> read = read(fileName, sheetName);
        HashMap<Integer, excelDemo> map = new HashMap<>();
        for (int i = 0; i < read.size(); i++) {
            map.put(i, read.get(i));
        }
        return map;
    }


    public static void test1(String fileName, String sheetName)  {
        HashMap<Integer, excelDemo> map = mapExcelCreate( fileName,sheetName);
//        获取map中的一个对象，反射获取对象中所有属性
        excelDemo excelDemo = map.get(1);
        Field[] fields = excelDemo.getClass().getDeclaredFields();
//        输出这个类中的所有属性 和 属性 对应的属性值
        try {
            for (Field field : fields) {
                field.setAccessible(true);
                String name = field.getName();
                String o = (String)field.get(excelDemo);
                if (o != null) {
                    System.out.println(name + " == " + o);
                } else {
                    System.out.println(name + "--》对应的对象是空值");
                }
            }
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }


//    获取返回集合，根据集合中对象获取其对应的变量值，以及对应的属性值
    public static String[][] test2(List<excelDemo> read ){
        int size = read.size();
        String[][] arr;
        arr = new String[size][];
        for (int i = 0; i < size; i++) {
            excelDemo demo = read.get(i);
            Field[] fields = demo.getClass().getDeclaredFields();
            try{
                for (int j = 0; j < fields.length; j++) {
                    Field field = fields[j];
                    field.setAccessible(true);
                    String o = (String)field.get(demo);
                    System.out.println(o);
                    if (o != null) {
                        arr[i][j] = o;
                    } else {
                        arr[i][j] = "";
                    }
//                    arr[i][j] = o;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return arr;
    }
}
