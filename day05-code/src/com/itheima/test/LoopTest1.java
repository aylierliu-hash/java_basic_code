package com.itheima.test;

public class LoopTest1 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            int temp = i;
            //检查是否为7的倍数
            if(temp%7==0){
                System.out.println("过！");
                continue;
            }
            //检查各个位数有没有7
            int flag = 0;
            while(temp!=0){
                if(temp%10==7){
                    flag = 1;
                    break;
                }
                temp/=10;
            }
            if(flag==1){
                System.out.println("过！");
                continue;
            }
            System.out.println(i);
        }
    }
}
