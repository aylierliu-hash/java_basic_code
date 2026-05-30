package com.itheima.test;

import java.util.Random;

public class ArrayTest5 {
    static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100)+1;
        }
        int total = 0;
        double average = 0;
        int count_below_average = 0;
        int count_above_average = 0;
        int count_equal_average = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        average = (double) total / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                count_below_average++;
            }else if (arr[i] < average) {
                count_above_average++;
            } else if (arr[i] == average) {
                count_equal_average++;
            }else{
                System.out.println("数组中存在异常值："+arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("数组中元素的总和为："+total);
        System.out.println("数组中元素的平均值为："+average);
        System.out.println("数组中大于平均值的元素有："+count_below_average+"个");
        System.out.println("数组中小于平均值的元素有："+count_above_average+"个");
        System.out.println("数组中等于平均值的元素有："+count_equal_average+"个");
    }
}
