package com.itheima.stringBuilderDemo;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();

        sb.append("hello");
        sb.append(", world");

        System.out.println(sb);

        //toString不会改变sb的内容，会读取sb的内容并返回一个字符串对象
        String str=sb.toString();
        System.out.println(str);
    }
}
