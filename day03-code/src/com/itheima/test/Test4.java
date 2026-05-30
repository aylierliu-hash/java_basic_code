package com.itheima.test;

import java.util.Scanner;

public class Test4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎体重：");
        int weight1 = sc.nextInt();
        System.out.println("请输入第二只老虎体重：");
        int weight2 = sc.nextInt();

        String result = (weight1==weight2)?"体重相等":"体重不相等";
        System.out.println(result);
    }
}
