package com.zhengZe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPa2 {
    public static void main(String[] args) {
        String str = "jAVa自从95年问世以来，经历了很多版本，目前企业中使用最多的是JAva8和JavA11,abbbbbbbbbbdsss" +
                "因为着两个是长期支持版本，下一个长期支持版本是jaVa17，相信不久之后Java17也会逐渐登上历史舞台";
//        需求一：贪婪爬取  abbbbbbbbbb
        String re = "ab+";
//        需求二：非贪婪爬取 ab
        String re1 = "ab+?";

//        获取正则表达式对象
        Pattern p = Pattern.compile(re1);
//        获取文本匹配器对象
        Matcher m = p.matcher(str);
//        循环打印已匹配数据
        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }
    }
}
