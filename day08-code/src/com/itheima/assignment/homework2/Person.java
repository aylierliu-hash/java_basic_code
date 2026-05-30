package com.itheima.assignment.homework2;

public class Person {
    private String name;
    private double height;
    private double weight;

    public void show(){
        System.out.println("人的名字是："+getName());
        System.out.println("人的身高是："+getHeight());
        System.out.println("人的体重是："+getWeight());
    }

    public void wash(){
        System.out.println("人"+"洗衣服");
    }

    public void cook(){
        System.out.println("人"+"做饭");
    }

    public Person() {
    }

    public Person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
