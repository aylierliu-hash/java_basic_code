package com.itheima.stringDemo;

public class StringDemo2 {
    static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = "ABC";

        //equals方法比较字符串的内容是否相等
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//false

        //equalsIgnoreCase方法比较字符串的内容是否相等，不区分大小写
        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str2.equalsIgnoreCase(str3));//true
    }
}
