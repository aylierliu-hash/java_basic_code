package com.itheima.assignment.homework4;

public class Dog {
    private String color;
    private String breed;

    public void eat(){
        System.out.println(getColor()+"的"+getBreed()+"正在吃东西");
    }

    public void lookHome(){
        System.out.println(getColor()+"的"+getBreed()+"正在看家");
    }

    public Dog() {
    }

    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
