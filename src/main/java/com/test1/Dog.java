package com.test1;

public class Dog extends Animal{
    public Dog(String color, int age) {
        super(color, age);
    }
    public Dog() {
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"的狗两只前腿死死的抱住"+something+"猛吃");
    }

    public void lookHome(){
        System.out.println("看家");
    }


}
