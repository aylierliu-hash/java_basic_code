package com.itheima.stringDemo;

import java.util.Scanner;

/**
 键盘录入，遍历字符串
**/
public class StringDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(i+":"+str1.charAt(i));
        }
    }
}
