package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(getPrimeNum(101, 200));
    }

    public static int getPrimeNum(int from, int to) {
        int num=0;
        while(from<=to){
            int divisor=2;
            while(divisor<from){
                if(from%divisor==0){
                    break;
                }
                divisor++;
            }
            if(divisor==from){
                num++;
            }
            from++;
        }
        return num;
    }


}
