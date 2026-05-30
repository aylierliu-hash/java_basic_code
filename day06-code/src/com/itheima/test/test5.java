package com.itheima.test;

public class test5 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};

        printArray(arr);
        System.out.println();
        printMax(arr);

        contains(32, arr);

        printArray(copyOfRange(arr, 1,3));
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+", ");
            }
        }
        System.out.print("]");
    }

    public static void printMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("最大值是："+max);
    }

    public static void contains(int num, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                System.out.println(num+"在数组中");
                return;
            }
        }
        System.out.println(num+"不在数组中");
    }

    public static int[] copyOfRange(int[] arr, int from, int to){
        int[] newArr = new int[to-from];

        for (int i = from,j = 0; i < to; i++,j++) {
            newArr[j] = arr[i];
        }

        return newArr;

    }
}
