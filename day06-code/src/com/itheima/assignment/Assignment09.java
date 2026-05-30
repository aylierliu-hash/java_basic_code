package com.itheima.assignment;

public class Assignment09 {
    static void main(String[] args) {
        int[]  arr = new int[]{1, 2, 3, 4, 5};
        int[]  newArr = copyOf(arr,3);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }

    public static int[] copyOf(int[] arr, int newLength) {
        int[] newArr = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

}
