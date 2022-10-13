package com.fanSheTest;

import com.excelTest.excelDemo;
import java.lang.reflect.Field;

public class fanSheClass {
    public static void main(String[] args) {
        excelDemo excelDemo = new excelDemo();
        Field[] declaredFields = excelDemo.getClass().getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            System.out.println(declaredField.getName());
//        }
        for (int i = 0; i < declaredFields.length; i++) {
            Field declaredField = declaredFields[i];
            System.out.println(declaredField.getName());
        }
    }
}
