package com.itheima.assignment.homework4;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        cat.setColor("黑色");
        cat.setBreed("中华田园猫");

        dog.setColor("黑色");
        dog.setBreed("拉布拉多");

        dog.eat();
        cat.eat();
        cat.catchMouse();
        dog.lookHome();
    }
}
