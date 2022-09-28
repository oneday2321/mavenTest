package com.test;

import java.io.*;
import java.nio.file.Files;

public class ReadTestCaseExcel {
    public static void main(String[] args) throws IOException {
        String excelPath = "E:\\javaCode\\mavenTest\\DataTest\\caseData.xlsx";
        String fileSheetName = "Sheet1";

        InputStream in = null;
        File file = new File(excelPath);
        InputStream inputStream = Files.newInputStream(file.toPath());
//        https://www.cnblogs.com/uncleyong/p/15867741.html
    }
}
