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
        testRead(file);
    }
    public static void testRead(String file){
        List<Objects> list = EasyExcel.read(file, excelZhu.class, new zhuList()).sheet("用户信息").doReadSync();
        for (int i = 0; i < list.size(); i++) {
            String s = JSON.toJSONString(list.get(i));
            JSONObject jsonObject = JSONObject.parseObject(s);
            List<String> read = JsonPath.read(jsonObject, "@..name");
            System.out.println(read.get(0));
        }
    }
}
