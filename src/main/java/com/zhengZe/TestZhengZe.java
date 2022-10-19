package com.zhengZe;

public class TestZhengZe {
    public static void main(String[] args) {
        System.out.println("abc".matches("[a]")); //false
        System.out.println("abc".matches("abc")); //true
        System.out.println("abc".matches("abcd"));//false
        System.out.println("abc".matches(".abcd"));//false
        System.out.println("abc".matches(".*abcd"));//false
//        检验手机号
        String phone1 = "16666666666";
        String phone2 = "12666666666";
        String phone3 = "13066666666";
        String phone4 = "00666666666";
        String phone5 = "166366666666";
        String re = "1[3-9]\\d{9}";
        System.out.println(phone1.matches(re));
        System.out.println(phone2.matches(re));
        System.out.println(phone3.matches(re));
        System.out.println(phone4.matches(re));
        System.out.println(phone5.matches(re));
//        校验邮箱
        String email1 = "123@123.com";
        String email2 = "123@1223.com";
        String email3 = "123@123.c2om";
        String email4 = "123@123.com.cd";
        String email5 = "123123.com";
        String re1 = "\\w+@[\\w&&[^_]]{2,3}\\.([\\w&&[^_]]{2,3}){1,2}";
        System.out.println(email1.matches(re1));
        System.out.println(email2.matches(re1));
        System.out.println(email3.matches(re1));
        System.out.println(email4.matches(re1));
        System.out.println(email5.matches(re1));
//        校验身份证号
        String id1 = "41082319971210777";
        String id2 = "41082319971210077x";
        String id3 = "410823199s71210775X";
        String id4 = "41082319971210077e";
        String id5 = "410823199712100770";
        String re2 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}(\\d|(?i)x)";
        System.out.println(id1.matches(re2));
        System.out.println(id2.matches(re2));
        System.out.println(id3.matches(re2));
        System.out.println(id4.matches(re2));
        System.out.println(id5.matches(re2));

    }
}
