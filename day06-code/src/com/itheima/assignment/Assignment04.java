package com.itheima.assignment;

import java.util.Scanner;

public class Assignment04 {
    static void main(String[] args) {
        System.out.println(getAbsolute(-1.3));
        System.out.println(getAbsolute(1.3));
    }

    public static double getAbsolute(double num){
        if(num<0){
            return num*-1;
        }else {
            return num;
        }
    }
}
