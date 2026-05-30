package com.itheima.test;

import java.util.Scanner;

import java.util.Random;

public class LoopTest4 {
    public static void main(String[] args) {
        Random rand=new Random();
        int num = rand.nextInt(100)+1;

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你猜的数字：");
        int guessNum=sc.nextInt();

        while(guessNum!=num){
          if(guessNum>num){
                System.out.println("你猜的数字大了");
            }else{
                System.out.println("你猜的数字小了");
            }
            System.out.println("请重新输入你猜的数字：");
            guessNum=sc.nextInt();
        }
        System.out.println("恭喜你猜对了！");

    }
}
