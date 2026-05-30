package com.itheima.test;

import java.util.Scanner;

public class Test1 {
     public static void main(String[] args) {
        //取数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位整数");
        int number = sc.nextInt();

        int ge = number % 10;
        int shi = number /10 % 10;
        int bai = number / 100 % 10;
        System.out.println("个位数为：" + ge);
        System.out.println("十位数为：" + shi);
        System.out.println("百位数为：" + bai);
    }
}
