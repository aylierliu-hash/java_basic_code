package com.itheima.test3;

public class PersonTest {
    static void main() {
        Person person = new Person();
        person.setName("张三");
        person.setAge(-18);
        person.setAge(18);
        person.setGender("男");

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
    }
}
