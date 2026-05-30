package com.itheima.test;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest7 {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int ran_index = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[ran_index];
            arr[ran_index] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
