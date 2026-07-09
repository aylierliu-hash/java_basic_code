package com.itheima.stringDemo;

import java.util.Scanner;

public class StringDemo3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();//键盘录入abc

        String str2 = "abc";

        System.out.println(str1 == str2);//false
    }
}
