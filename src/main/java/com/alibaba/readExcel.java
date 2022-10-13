package com.alibaba;

import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.jayway.jsonpath.JsonPath;

import java.util.List;
import java.util.Objects;

public class readExcel {
    public static void main(String[] args) {
        String file = "E:\\javaCode\\mavenTest\\DataTest\\Data.xlsx";
        String sheetName = "用户信息";
        testRead(file,sheetName);
    }
    public static void testRead(String file,String sheetName){
        List<excelZhu> list = EasyExcel.read(file, excelZhu.class, new zhuList()).sheet(sheetName).doReadSync();
//        for (excelZhu zhu : list) {
//            String s = JSON.toJSONString(zhu);
//            JSONObject jsonObject = JSONObject.parseObject(s);
//            List<String> read = JsonPath.read(jsonObject, "@..name");
//            System.out.println(read.get(0));
//        }
        System.out.println(list.get(0));
    }
}
