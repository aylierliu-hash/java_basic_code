package com.itheima.stringDemo;

import java.util.Scanner;

/**
 * 字符串反转
 * 定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果例如，键盘录入abc，输出结果cba
 */
public class StringDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        System.out.println(reverse(str1));

    }
    public static String reverse(String str1){
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2+=str1.charAt(i);
        }
        return str2;
    }
}
