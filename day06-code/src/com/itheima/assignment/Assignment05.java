package com.itheima.assignment;

import java.util.Scanner;

public class Assignment05 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num=sc.nextInt();
        System.out.println(num+"是"+getDigits(num)+"位数字");
    }

    public static int getDigits(int num){
        int digits=0;
        while (num>0){
            num=num/10;
            digits++;
        }
        return digits;
    }

}
