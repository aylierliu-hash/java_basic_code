package com.itheima.homework;

import java.util.Scanner;

public class assignment4 {
    public static void main(String[] args) {
        int menbership = 0;
        double discount = 0;
        int originalPrice = 0;
        double finalPrice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入顾客类别：");
        menbership = sc.nextInt();
        if(menbership!=0||menbership!=1){
            System.out.println("您的输入有误");
            return;
        }
        System.out.println("请输入购物金额：");
        originalPrice = sc.nextInt();
        if(originalPrice<0){
            System.out.println("您的输入有误");
            return;
        }
        //根据顾客类别计算折扣
        if(menbership==0){
            if(originalPrice<100){
                discount = 1;
            } else {
                discount = 0.9;
            }
        } else {
            if(originalPrice<200){
                discount = 0.8;
            } else {
                discount = 0.75;
            }
        }
        //计算最终金额
        finalPrice = originalPrice*discount;
        System.out.println("您的最终金额为："+finalPrice);
    }
}
