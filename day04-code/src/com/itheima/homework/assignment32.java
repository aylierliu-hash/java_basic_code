package com.itheima.homework;

import java.util.Scanner;

public class assignment32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int number1=sc.nextInt();
        System.out.println("请输入第二个数字：");
        int number2=sc.nextInt();
        int count = 0;
        for(int i=number1;i<=number2;i++){
            if(i%3==0&&i%5==0){
                count++;
            }
        }
        System.out.println(number1+"到"+number2+"范围内能被3整除且能被5整除的数字一共有"+count+"个");
    }
}
