package com.itheima.test;

import java.util.Arrays;

public class ArrayTest6 {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0, j = arr.length-1; i < j; i++, j--) {
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

//        System.out.println(Arrays.toString(arr));
    }
}
