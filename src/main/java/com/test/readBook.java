package com.test;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readBook {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("E:\\javaCode\\mavenTest\\DataTest\\验证.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(in);
        XSSFSheet sheet = workbook.getSheet("Sheet1");


        int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
        System.out.println(physicalNumberOfRows);
        for (int i = 0; i < physicalNumberOfRows; i++) {
            XSSFRow row = sheet.getRow(i);
            int physicalNumberOfCells = row.getPhysicalNumberOfCells();
            for (int j = 0; j < physicalNumberOfCells; j++) {
                System.out.print(row.getCell(j) + "\t");
            }
            System.out.println();
        }
        in.close();
    }
}
