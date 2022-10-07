package com.test1;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("黑色", 3);
        Cat c = new Cat("灰色", 2);
        Person person1 = new Person("老王",23);
        Person person2 = new Person("老李",25);
        person1.KeepPet(d,"大骨头");
        person2.KeepPet(c,"小鱼干");
    }
}
