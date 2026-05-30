package com.itheima.test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个大于等于2数字：");
        int num=sc.nextInt();
        int i = 0;
        while(i*i<=num){
            i++;
        }
        System.out.println(num+"的平方根为："+(i-1));
    }
}
