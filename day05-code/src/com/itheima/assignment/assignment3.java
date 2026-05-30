package com.itheima.assignment;

import java.util.Arrays;
import java.util.Random;

public class assignment3 {
    public static void main(String[] args) {
        int[] arr=new int[6];
        Random rand=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=rand.nextInt(100);
        }
        System.out.println("随机设置的数组为："+ Arrays.toString(arr));
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total+=arr[i];
        }
        System.out.println("数组的和为："+total);
    }
}
