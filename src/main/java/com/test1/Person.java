package com.test1;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void KeepPet(Animal A ,String something){
        if(A instanceof Dog ){
            Dog d = (Dog)A;
            System.out.println("年龄为"+age +"的"+name+"养了一只"+d.getColor()+"的"+d.getAge()+"岁的狗");
            d.eat(something);
        } else if (A instanceof Cat) {
            Cat c = (Cat)A;
            System.out.println("年龄为"+age +"的"+name+"养了一只"+c.getColor()+"的"+c.getAge()+"岁的猫");
            c.eat(something);
        }
    }
}
