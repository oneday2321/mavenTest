package com.test;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DemoJson {
    private static final String demoJson = "{\"code\":9420, \"msg\":\"恭喜qzcsbj，登录成功\",\"token\":\"538bbaba44be5d3d3856718e6c637d02\"}";
    private static final String demoJson1 = "{\"code\":\"0\"," +
            "\"msg\":\"sucess\",\"data\":[{\"username\":\"韧\"," +
            "\"realname\":\"tester1\",\"sex\":\"1\",\"phone\":" +
            "\"13800000001\"},{\"username\":\"全栈测试笔记\",\"realname\"" +
            ":\"tester2\",\"sex\":\"1\",\"phone\":\"13800000002\"}]}";

    public static void main(String[] args) {
        List<String> read = JsonPath.read(demoJson, "@..token");
        System.out.println(read.get(0));

        List<String> ph = JsonPath.read(demoJson1, "@..data[?(@.username == '韧')].phone");
        System.out.println(ph.get(0));

        List<Object> read1 = JsonPath.read(demoJson1, "@.data[*].['username','phone']");
        System.out.println(read1);

    }
}
