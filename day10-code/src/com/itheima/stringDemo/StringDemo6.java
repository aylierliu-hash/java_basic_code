package com.itheima.stringDemo;

import java.util.Scanner;

/**
 * 统计字符次数
 * 键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)
 */
public class StringDemo6 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int countUp=0;
        int countDown=0;
        int countNum=0;

//        char[] upper = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//        char[] down = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
//        char[] num = {'0','1','2','3','6','7','8','9'};
        
        //可以直接比较字符的ASCII码值
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                countUp++;
            } else if (c >= 'a' && c <= 'z') {
                countDown++;
            } else if (c >= '0' && c <= '9') {
                countNum++;
            }
        }
        System.out.println("大写字母字符出现的次数为："+countUp);
        System.out.println("小写字母字符出现的次数为："+countDown);
        System.out.println("数字字符出现的次数为："+countNum);
    }
}
