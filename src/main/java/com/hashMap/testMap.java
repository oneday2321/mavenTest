package com.hashMap;

import java.util.HashMap;

public class testMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
//        添加数据
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"王五");
        map.put(4,"赵六");
//        获取数据
        System.out.println(map.get(1));
//        获取所有键
        System.out.println(map.keySet());
//        替换
        map.replace(1,"呜呜");
//        长度
        System.out.println(map.size());
//        删除指定
        map.remove(2);

        System.out.println(map);


    }
}
