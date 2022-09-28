package com.test;

import com.jayway.jsonpath.JsonPath;

import java.util.List;

public class Book {
    private static final String json = "{ \"store\": {\n" +
            "    \"book\": [ \n" +
            "      { \"category\": \"reference\",\n" +
            "        \"author\": \"Nigel Rees\",\n" +
            "        \"title\": \"Sayings of the Century\",\n" +
            "        \"price\": 8.95\n" +
            "      },\n" +
            "      { \"category\": \"fiction\",\n" +
            "        \"author\": \"Evelyn Waugh\",\n" +
            "        \"title\": \"Sword of Honour\",\n" +
            "        \"price\": 12.99\n" +
            "      },\n" +
            "      { \"category\": \"fiction\",\n" +
            "        \"author\": \"Herman Melville\",\n" +
            "        \"title\": \"Moby Dick\",\n" +
            "        \"isbn\": \"0-553-21311-3\",\n" +
            "        \"price\": 8.99\n" +
            "      },\n" +
            "      { \"category\": \"fiction\",\n" +
            "        \"author\": \"J. R. R. Tolkien\",\n" +
            "        \"title\": \"The Lord of the Rings\",\n" +
            "        \"isbn\": \"0-395-19395-8\",\n" +
            "        \"price\": 22.99\n" +
            "      }\n" +
            "    ],\n" +
            "    \"bicycle\": {\n" +
            "      \"color\": \"red\",\n" +
            "      \"title\": \"外面的title\",\n" +
            "      \"price\": 19.95\n" +
            "    }\n" +
            "  }\n" +
            "}";

    public static void main(String[] args) {
//        获取所有title值
        List<String> read1 = JsonPath.read(json, "@..title");
        System.out.println(read1.get(1));
//        获取book中的所有title值
        List<String> read2  = JsonPath.read(json, "@..book[*].title");
        System.out.println(read2);
//        获取book中所有isbn的所有值
        List<Book> read3  = JsonPath.read(json, "@..book[?(@.isbn)]");
        System.out.println(read3.get(1));
//        获取book中不包含isbn的所有值
        List<Book> read4  = JsonPath.read(json, "@..book[?(!@.isbn)]");
        System.out.println(read4);
//        获取book中price的值小于10的
        List<Double> read5= JsonPath.read(json, "@..book[?(@.price < 10)].price");
        System.out.println(read5);
//        获取book中title是 ' The Lord of the Rings ' 的对象
        List<Book> titles = JsonPath.read(json, "$..book[?(@.title == 'The Lord of the Rings')]");
        System.out.println(titles);
//        获取book中的个数
        int read= JsonPath.read(json, "$.store.book.size()");
        System.out.println(read);

    }
}
