package com.itheima.stringBuilderDemo;

import java.util.Scanner;

/**
 * 对称字符串
 * 需求:键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
 * 对称字符串:123321、111
 * 非对称字符串:123123
 */
public class StringBuilderDemo5 {
    public static void main(String[] args) {
        //获取键盘输入的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str=sc.nextLine();

        //判断是否是对称字符串
        boolean isPalindrome=isPalindrome(str);

        System.out.println("该字符串"+(isPalindrome?"是":"不是")+"对称字符串");
    }

    public static boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        //判断sb的内容是否等于str
        return sb.toString().equals(str);
    }
}
