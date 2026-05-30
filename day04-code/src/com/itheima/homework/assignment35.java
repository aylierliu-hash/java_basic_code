package com.itheima.homework;


import java.util.Scanner;

public class assignment35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入被除数：");
        int dividend=sc.nextInt();
        System.out.println("请输入除数：");
        int divisor=sc.nextInt();
        int qoutient = 0;
        int remiander = 0;
        while(dividend>divisor){
            dividend-=divisor;
            qoutient++;
        }
        remiander=dividend;
        System.out.println("商是："+qoutient+"\n"+"余数是："+remiander);
    }
}
