package com.itheima.assignment.homework2;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setName("张三");
        person1.setHeight(180.0);
        person1.setWeight(80.0);

        person2.setName("李四");
        person2.setHeight(170.0);
        person2.setWeight(70.0);

        person1.show();
        person2.show();

        person1.cook();
        person2.cook();

        person1.wash();
        person2.wash();
    }
}
