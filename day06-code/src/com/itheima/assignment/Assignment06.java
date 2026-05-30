package com.itheima.assignment;

import java.util.Scanner;

public class Assignment06 {
    static void main(String[] args) {
        int[]  arr1 = new int[]{1, 2, 3, 4, 5};
        int[]  arr2 = new int[]{1, 2, 3, 4, 5};
        int[]  arr3 = new int[]{1, 2, 3, 4};

        System.out.println(equals(arr1,arr2));
        System.out.println(equals(arr1,arr3));

    }

    public static boolean equals(int[] arr1, int[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }

        return true;
    }

}
