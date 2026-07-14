package com.itheima.test;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * 作业4
 * 请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。比如：Hello12345World中字母：10个，数字：5个。
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println("请输入任意字符字符串：");
        Scanner sc = new Scanner(in);
        String str = sc.nextLine();
        count(str);
    }

    public static void count(String str) {
        int alphaCount = 0;
        int digitCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                alphaCount++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                alphaCount++;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                digitCount++;
            }
        }
        System.out.println(str+"中字母：" + alphaCount + "个，数字：" + digitCount + "个");
    }
}
