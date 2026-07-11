package com.itheima.stringJoinerDemo;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    static void main(String[] args) {
        StringJoiner sj=new StringJoiner("---");
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);

        StringJoiner sj2=new StringJoiner(", ", "[", "]");
        sj2.add("aaa").add("bbb").add("ccc");

        //length方法返回sj2的内容的长度，不改变sj2的内容
        //长度是字符的个数，而不是其中被分割的字符串的个数
        //例如：[aaa,bbb,ccc]的长度是15，而不是3
        System.out.println(sj2);
        System.out.println(sj2.length());//15


    }
}
