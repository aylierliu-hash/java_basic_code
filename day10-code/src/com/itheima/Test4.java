package com.itheima;

public class Test4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        System.out.println(sb1.capacity()); //16
        System.out.println(sb1.length()); //0

        sb1.append("abc");
        System.out.println(sb1.capacity()); //16
        System.out.println(sb1.length()); //3

        sb1.append("defghijklmnopqrstuvwxyz");
        System.out.println(sb1.capacity()); //34
        System.out.println(sb1.length()); //26

        sb2.append("abcdefghijklmnopqrstuvwxyz0123456789");
        System.out.println(sb2.capacity()); //36
        System.out.println(sb2.length()); //36

    }
}
