package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest4_1 {
    public static void main(String[] args) {
        Random rand=new Random();
        int num = rand.nextInt(100)+1;
        System.out.println("随机生成的数字为："+num);

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你猜的数字：");
        int guessNum=sc.nextInt();

        int count=0;

        while(true){
          if(guessNum>num){
                System.out.println("你猜的数字大了");
            }else if (guessNum<num){
                System.out.println("你猜的数字小了");
            }else if(guessNum==num){
                System.out.println("恭喜你猜对了！");
                break;
            }else{
                System.out.println("你输入的数字有误，请重新输入！");
            }
            count++;
            if(count==3){
                System.out.println("很遗憾，你猜错了3次，游戏结束！");
                break;
            }
            System.out.println("请重新输入你猜的数字：");
            guessNum=sc.nextInt();
        }
    }
}
