package com.itheima.test;

public class ArrayTest4 {
    static void main(String[] args) {
       int[] arr = {33, 5, 22, 44, 55};
       int max = arr[0];
       int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("数组中的最大值为："+max);
        System.out.println("数组中的最小值为："+min);
    }
}
