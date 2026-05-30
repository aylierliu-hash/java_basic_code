package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        System.out.println(encode("12345"));
        System.out.println(decode(encode("12345")));
    }


    public static String encode(String password) {
        //处理1
        char[] encodedPassword1 =new char[password.length()];//String不可修改，只能使用char[]
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);//这个函数获取String特定位置的char
            int num = ch - '0';//获得char字面值，也就是在字面值不变的情况下，int和char之间如何相互转换
            encodedPassword1[i]= (char) ((num+5)%10+'0');
        }
        //处理2：反转
        char[] encodedPassword2 =new char[password.length()];
        for (int i = 0; i < encodedPassword2.length; i++) {
            encodedPassword2[i] = encodedPassword1[encodedPassword1.length-i-1];
        }
        String encodedPassword = new String(encodedPassword2);
        return encodedPassword;
    }

    public static String decode(String password) {
        //处理1：反转
        char[] encodedPassword1 =new char[password.length()];
        for (int i = 0; i < encodedPassword1.length; i++) {
            encodedPassword1[i] = password.charAt(encodedPassword1.length-i-1);
        }
        //处理2
        char[] encodedPassword2 =new char[password.length()];
        for (int i = 0; i < encodedPassword2.length; i++) {
            char ch = encodedPassword1[i];
            int num = ch - '0';
            encodedPassword2[i]= (char)((num-5+10)%10+'0');
        }
        String encodedPassword = new String(encodedPassword2);
        return encodedPassword;
    }

}
