package com.itheima.arrayDemo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr = {7,8,9,10,11};
//        for (int i = 0; i < 5; i++) {
//            System.out.println(arr[i]);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        for (int j : arr) {
            System.out.println(j);
        }

    }
}
