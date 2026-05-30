package com.itheima.assignment;

public class Assignment10 {
    static void main(String[] args) {
        int[]  arr = new int[]{1, 2, 3, 4, 5};
        int[]  newArr = copyOfRange(arr,1,3);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }

    public static int[] copyOfRange(int[] arr,int from, int to) {
        int[] newArr = new int[to - from + 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i+from];
        }
        return newArr;
    }

}
