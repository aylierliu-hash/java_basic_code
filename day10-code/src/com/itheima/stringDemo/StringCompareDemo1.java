package com.itheima.stringDemo;

public class StringCompareDemo1 {
    static void main(String[] args) {
        //直接赋值创建的字符串
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);//true

        //通过new关键字创建的字符串
        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str3 == str4);//false

        //同理，不同创建方法创建的字符串，其地址值也不相等
        System.out.println(str3 == str4);//false
    }
}
