package com.itheima.test;

/**
 * 作业5
 * 请定义一个方法用于判断一个字符串是否是对称的字符串，
 * 并在主方法中测试方法。例如：“abcba”、"上海自来水来自海上"均为对称字符串。
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(isSymmetric("abcba"));
        System.out.println(isSymmetric("上海自来水来自海上"));
        System.out.println(isSymmetric("abc"));

    }

    public static boolean isSymmetric(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

//        if (sb.toString().equals(str)) return true;
//        return false;
        return sb.toString().equals(str);

    }
}
