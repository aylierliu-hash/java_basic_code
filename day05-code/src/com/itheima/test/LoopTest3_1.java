package com.itheima.test;

import java.util.Scanner;

public class LoopTest3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num=sc.nextInt();
        boolean flag=true;
        int squrt = 0;
        //记录循环执行次数
        int count=0;
        while(squrt*squrt<=num){
            squrt++;
        }
        for(int i=2;i<=squrt;i++){
            if(num%i==0){
                flag=false;
                break;
            }
            count++;
        }
        if(flag){
                System.out.println(num+"是质数");
        }else{
                System.out.println(num+"不是质数");
        }
        System.out.println("循环执行了"+count+"次");


    }
}
