package com.itheima.assignment.homework1;

public class Phone {
    private String brand;
    private double price;
    private String color;

    public void call(){
        System.out.println("用价格为"+price+"的"+color+brand+"打电话");
    }
    public void sendMessage(){
        System.out.println("用价格为"+price+"的"+color+brand+"发短信");
    }

    public Phone() {
    }
    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
