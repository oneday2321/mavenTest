package com.test;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*
 * @Description
 *  读取excel文件，修改excel文件
 */
public class readBook {
    public static void main(String[] args) throws IOException {

        FileInputStream in = new FileInputStream("E:\\javaCode\\mavenTest\\DataTest\\验证.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(in);
//        XSSFSheet sheet = workbook.getSheet("Sheet1");
//        int physicalNumberOfCells1 = sheet.getRow(0).getPhysicalNumberOfCells();
//        System.out.println(physicalNumberOfCells1);
//
//        int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//        System.out.println(physicalNumberOfRows);
//        for (int i = 0; i < physicalNumberOfRows; i++) {
//            XSSFRow row = sheet.getRow(i);
//            int physicalNumberOfCells = row.getPhysicalNumberOfCells();
//            for (int j = 0; j < physicalNumberOfCells; j++) {
//                System.out.print(row.getCell(j) + "\t");
//            }
//            System.out.println();
//        }

        canShu(workbook);
        in.close();
    }

    public static void canShu(XSSFWorkbook workbook){
        /*
        * @Description
        * 1、将表头数据全部存放至一个数组中
        * 2、将数组的标题对应至每一行中，键值对 Map
        * @Params  文件
        * @Return
        */

        XSSFSheet sheet1 = workbook.getSheet("Sheet1");
        XSSFRow row = sheet1.getRow(0);
        int physicalNumberOfCells = row.getPhysicalNumberOfCells();
        String [] str = new String[physicalNumberOfCells];
        for (int i = 0; i < str.length; i++) {
            XSSFCell cell = row.getCell(i);
            str[i] = cell.toString();
        }
        System.out.println(Arrays.toString(str));
    }
}
