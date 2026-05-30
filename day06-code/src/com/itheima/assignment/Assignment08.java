package com.itheima.assignment;

public class Assignment08 {
    static void main(String[] args) {
        int[]  arr = new int[]{1, 2, 3, 4, 5};
        fill(arr, 1, 3, 6);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] fill(int[] arr,int fromIndex,int toIndex,int value){
        for (int i = fromIndex; i < toIndex; i++) {
            arr[i] = value;
        }
        return arr;
    }

}
