package com.itheima.test;

import java.util.Scanner;

public class Test19 {

     public static void main(String[] args) {
         //定义被除数除数商和余数
         int dividen;
         int divider;
         int result = 0;
         int remainder = 0;
         //用户输入
         Scanner sc = new Scanner(System.in);
         System.out.println("请输入被除数: ");
         dividen = sc.nextInt();
         System.out.println("请输入除数: ");
         divider = sc.nextInt();
         //计算商和余数
         for(;dividen>=divider;dividen-=divider){
             result++;
         }
         System.out.println("商为: "+result);
         System.out.println("余数为: "+dividen);
     }

}
