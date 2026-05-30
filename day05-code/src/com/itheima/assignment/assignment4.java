package com.itheima.assignment;

import java.util.Arrays;
import java.util.Random;

public class assignment4 {
    public static void main(String[] args) {
        int[]  arr = new int[]{2, 1, 3, 5, 4};
        int number = 0;
        int dighit = (int) Math.pow(10, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            number+=arr[i]*dighit;
            dighit/=10;
        }
        System.out.println(number);
    }
}
