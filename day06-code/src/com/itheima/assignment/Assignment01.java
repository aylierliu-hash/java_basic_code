package com.itheima.assignment;

public class Assignment01 {
    //定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
    static void main(String[] args) {
        System.out.println(compare(1, 2));
    }

    public static double compare(double a,double b) {
        if (a<b) {
            return a;
        } else if (a>b) {
            return b;
        }
        else {
            return a;
        }
    }
    public static double getMin(double a, double b) {
        double min = a > b ? a : b;
        return min;
    }
}
