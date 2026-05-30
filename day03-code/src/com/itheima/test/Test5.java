package com.itheima.test;


public class Test5 {
    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        int higher;
        int highest;
        higher = height1 > height2 ? height1 : height2;
        highest = higher > height3 ? higher : height3;

        System.out.println("最高的身高是：" + highest);
    }
}
