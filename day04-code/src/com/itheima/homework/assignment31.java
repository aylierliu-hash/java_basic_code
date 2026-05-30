package com.itheima.homework;

import java.util.Scanner;

public class assignment31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int number1=sc.nextInt();
        System.out.println("请输入第二个数字：");
        int number2=sc.nextInt();
        //呀。。还要判断一下最小值吗。。。
        int sum = 0;
        for(int i=number1;i<=number2;i++){
            sum+=i;
        }
        System.out.println(number1+"到"+number2+"范围的数字和为"+sum);
    }
}
