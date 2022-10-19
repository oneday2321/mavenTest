package com.zhengZe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPa1 {
    public static void main(String[] args) {
        String str = "jAVa自从95年问世以来，经历了很多版本，目前企业中使用最多的是JAva8和JavA11" +
                "因为着两个是长期支持版本，下一个长期支持版本是jaVa17，相信不久之后Java17也会逐渐登上历史舞台";
////        需求一：打印所有JavaXX
//        String re = "Java\\d{0,2}";
////        获取正则表达式对象
//        Pattern p = Pattern.compile(re);

////        需求二：获取版本号是8、11、17的Java文本，但只要Java，不要版本号
//        String re1 = "((?i)Java)(?=8|11|17)";
////        获取正则表达式对象
//        Pattern p = Pattern.compile(re1);

////        需求三：获取版本号是8、11、17的Java文本，包括版本号
//        String re3 = "((?i)Java)(?:8|11|17)";
////        获取正则表达式对象
//        Pattern p = Pattern.compile(re3);

//        需求四：获取除了版本号是8、11、17的Java文本
        String re4 = "((?i)Java)(?!8|11|17)";
//        获取正则表达式对象
        Pattern p = Pattern.compile(re4);
//        获取文本匹配器对象
        Matcher m = p.matcher(str);
//        循环打印已匹配数据
        while (m.find()) {
            String s = m.group();
            System.out.println(s);
        }


    }
}
