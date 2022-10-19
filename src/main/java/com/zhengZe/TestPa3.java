package com.zhengZe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPa3 {
    public static void main(String[] args) {
        /*
         字符串操作：
            正则替换    replaceAll
            字符截取    substring
         */
        String str = "{\"username\":\"${username}\",\"password\":\"${password}\"}";
        String re = "\\$\\{\\w+\\}";
        String s = str.replaceAll(re, "tea");
        System.out.println(s);
        Pattern p = Pattern.compile(re);
        Matcher m = p.matcher(str);
        while (m.find()) {
            String group = m.group();
            System.out.println(group);
            String substring = group.substring(2, group.length() - 1);
            System.out.println(substring);
        }

    }
}
