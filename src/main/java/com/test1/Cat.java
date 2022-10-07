package com.test1;

public class Cat extends Animal{

    public Cat(String color, int age) {
        super(color, age);
    }

    public Cat() {
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"的猫眯着眼睛侧着头吃"+something);
    }
    public void catchMouse(){
        System.out.println("逮老鼠");
    }

}
