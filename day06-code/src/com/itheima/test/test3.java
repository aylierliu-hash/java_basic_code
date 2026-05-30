package com.itheima.test;

public class test3 {
    public static void main(String[] args) {
        compare(getArea(5.3, 1.7), getArea(2.4, 2.7));
    }

    public static double getArea(double length, double width){
        double area=length*width;
        return area;
    }

    public static void compare(double area1,double area2){
        if(area1>area2){
            System.out.println("第一个面积大");
        }else if(area1<area2){
            System.out.println("第二个面积大");
        }else{
            System.out.println("面积一样大");
        }
    }
}
