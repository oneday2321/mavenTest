package com.fanSheTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class PresonTest {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.fanSheTest.Person");
            Object o = aClass.newInstance();
            for (int i = 1; i < 4; i++) {
                Method method = aClass.getMethod("getPerson" + i, String.class);
                String invoke = (String) method.invoke(o, new Object[]{i + ""});
                System.out.println(invoke);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
