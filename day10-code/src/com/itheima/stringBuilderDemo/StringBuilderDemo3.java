package com.itheima.stringBuilderDemo;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        //StringBuider打印对象是属性值而不是地址值
        System.out.println(sb);

        //append方法在末尾添加字符串
        // 直接改变sb的内容
        sb.append("hello");
        System.out.println(sb);

        //reverse方法将sb的内容反转
        // 直接改变sb的内容
        sb.reverse();
        System.out.println(sb);

        //length方法返回sb的内容的长度，不改变sb的内容
        System.out.println(sb.length());

        //toString不会改变sb的内容，会读取sb的内容并返回一个字符串对象
        String str=sb.toString();
        System.out.println(str);

    }
}
