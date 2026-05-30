package com.itheima.test;

public class test4 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        compare(b1,b2);

        short s1 = 10;
        short s2 = 20;
        compare(s1,s2);

        int i1 = 10;
        int i2 = 20;
        compare(i1,i2);

        long l1 = 10;
        long l2 = 20;
        compare(l1,l2);

    }

    public  static void compare(byte a,byte b){
        if(a>b){
            System.out.println("第一个数大");
        } else if (a<b) {
            System.out.println("第二个数大");
        }else{
            System.out.println("一样大");
        }
    }

    public  static void compare(short a,short b){
        if(a>b){
            System.out.println("第一个数大");
        } else if (a<b) {
            System.out.println("第二个数大");
        }else{
            System.out.println("一样大");
        }
    }

    public  static void compare(int a,int b){
        if(a>b){
            System.out.println("第一个数大");
        } else if (a<b) {
            System.out.println("第二个数大");
        }else{
            System.out.println("一样大");
        }
    }
    public  static void compare(long a,long b){
        if(a>b){
            System.out.println("第一个数大");
        } else if (a<b) {
            System.out.println("第二个数大");
        }else{
            System.out.println("一样大");
        }
    }
}
