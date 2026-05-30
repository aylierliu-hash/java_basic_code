package com.itheima.test;

import java.util.Scanner;

public class Test18 {

     public static void main(String[] args) {
         //记录数字
         int num =0;
         //记录数字的位数
         int digit = 1;
         //记录除数
         int divi = 10;
         //记录用来比较的位数
         int head = 0, tail = 0;
         //记录最高位数的除数
         int maxDivi = 0;

         //用户输入
         Scanner sc = new Scanner(System.in);
         System.out.println("请输入一个数字: ");
         num = sc.nextInt();

         //先除掉以0结尾的数字
         if(num%10==0){
             System.out.println("输入的数字不是回文数");
             return ;
         }
         //1.确定有几位数字
         while(num/divi!=0){
             digit++;
             divi*=10;
         }
         //2.拆解比较每一位数
         //恢复divi
         divi = 10;
         //初始化head和tail
         //head = num/(10^(digit-1));错误！！这是按位与不是次方!!
         maxDivi = (int)Math.pow(10, digit-1);
         head = num/maxDivi;
         tail = num%10;

         //比较head和tail是否相等, 同时要保证当前比较的数字的位数大于1
         while(head==tail&&digit>2){
             //掐头去尾
             num=num - (num/maxDivi)*maxDivi;
             num = num/10;
             //更新digit
             digit-=2;
             //更新head和tail
             //这里maxDivi有为0的风险;所以两位数及以下要分开判断
             maxDivi = (int)Math.pow(10, digit-1);
             head = num/maxDivi;
             tail = num%10;
         }
         //3.二次判断是否是回文数(差点漏了纯不是回文数的情况)
         if(digit>2){
             System.out.println("输入的数字不是回文数");
         } else if (digit==2) {
             if(num%10==num/10){
                 System.out.println("输入的数字是回文数");
             }else {
                 System.out.println("输入的数字不是回文数");
             }
         } else {
             System.out.println("输入的数字是回文数");
         }

     }

}
