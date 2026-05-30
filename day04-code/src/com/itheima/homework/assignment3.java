package com.itheima.homework;

import java.util.Scanner;

public class assignment3 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       double principle=0;
       //输入本金
        System.out.println("请输入本金：");
        //输入格式检查
        principle=sc.nextDouble();
        if(principle<1000){
            System.out.println("输入的本金不能小于1000");
            return;
        }
        //展示储蓄业务
        System.out.println("您可以选择以下储蓄业务，其对应的存期和利率是：");
        System.out.println("1. 一年 2.25");
        System.out.println("2. 两年 2.7");
        System.out.println("3. 三年 3.25");
        System.out.println("4. 五年 3.6");
        System.out.println("请输入您的选择：");
        int choice=sc.nextInt();
        //根据选择计算利息
        double interest=0;
        switch(choice){
            case 1:
                interest=principle*0.0225*1;
                break;
            case 2:
                interest=principle*0.027;
                break;
            case 3:
                interest=principle*0.0325*3;
                break;
            case 4:
                interest=principle*0.036*5;
                break;
            default:
                System.out.println("您的选择有误");
                return;
        }
        //计算总金额
        double total=principle+interest;
        //展示结果
        System.out.println("您选择的存期是"+choice+"年，利率是"+(choice==1?"2.25%":choice==2?"2.7%":choice==3?"3.25%":"3.6%")+"，本金是"+principle+"，利息是"+interest+"，总金额是"+total);
        //上面的三元运算符通过嵌套实现了根据选择展示不同的利率；实际上相当于if-else语句的一种简洁写法
    }
}
