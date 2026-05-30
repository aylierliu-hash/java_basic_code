package com.itheima.assignment;

public class Assignment07 {
    static void main(String[] args) {
        int[]  arr = new int[]{1, 2, 3, 4, 5};
        fill(arr, 6);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] fill(int[] arr,int value){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;
    }

}
