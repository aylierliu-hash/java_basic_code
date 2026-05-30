package com.itheima.test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num=sc.nextInt();
        int flag=0;
        //记录循环执行次数
        int count=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=1;
                break;
            }
            count++;
        }
        if(flag==0){
                System.out.println(num+"是质数");
        }else{
                System.out.println(num+"不是质数");
        }

        System.out.println("循环执行了"+count+"次");

    }
}
