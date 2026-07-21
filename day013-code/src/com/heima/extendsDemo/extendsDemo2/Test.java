package com.heima.extendsDemo.extendsDemo2;

/**
 * 一般一个java文件中只能有一个类，这是规范写法
 * 实际上可以有多个类，但是只能有一个public类
 */

public class Test {
    static void main(String[] args) {
        Parent parent = new Parent("张三", 18);
        Parent child = new Child();
    }
}

class Parent{
    String name;
    int age;

    public Parent() {
    }
    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Child extends Parent{

}