package com.itheima.test;

import java.util.Scanner;

public class Test2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的时髦度：");
        int mine  = sc.nextInt();
        System.out.println("请输入对方的时髦度：");
        int them = sc.nextInt();

        boolean result = mine > them;
        System.out.println(result);

    }
}
