package com.itheima.homework;

import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入三个整数: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int min = 0;

        //计算三个数的最小值
        min = a<b?a:b;
        min = min<c?min:c;

        System.out.println("三个数的最小值为: "+min);
    }
}
