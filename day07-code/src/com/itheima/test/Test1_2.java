package com.itheima.test;

import java.util.Scanner;

public class Test1_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入机票价格：");
        double price=sc.nextDouble();
        System.out.println("请输入当前月份：");
        int month=sc.nextInt();
        System.out.println("请问购买舱型是：1.头等舱 2.经济舱");
        int flag=sc.nextInt();

        price(price,month,flag);

    }

    public static void price(double price, int month, int flag){
        if(5<=month&&month<=10){
            price = getPrice(flag, price, 0.9, 0.85);
        }else if(1<=month&&month<=4||11<=month&&month<=12){
            price = getPrice(flag, price, 0.7, 0.65);
        }else{
            System.out.println("月份输入错误");
            return;
        }
        System.out.println("折后价格为："+price);
    }

    private static double getPrice(int flag, double price, double x, double x1) {
        if (flag == 1) {
            price = price * x;
        } else if (flag == 2) {
            price = price * x1;
        } else {
            System.out.println("键盘输入错误");
        }
        return price;
    }
}
