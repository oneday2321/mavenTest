package com.alibaba;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.Date;

public class outputExcel {
    public static void main(String[] args) {
        ArrayList<excelZhu> dataList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            excelZhu zhu = new excelZhu();
            zhu.setName("张三"+ i);
            zhu.setAge(20+i);
            zhu.setTime(new Date(System.currentTimeMillis()));
            dataList.add(zhu);
        }
        EasyExcel.write("E:\\javaCode\\mavenTest\\DataTest\\Data.xlsx", excelZhu.class).sheet("用户信息").doWrite(dataList);
    }
}
