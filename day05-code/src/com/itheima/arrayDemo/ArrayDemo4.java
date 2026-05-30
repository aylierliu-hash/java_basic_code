    package com.itheima.arrayDemo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //动态初始化
        String[] arr = new String[50];
        arr[0] = "张三";
        arr[1] = "李四";
        //获取
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);//默认值是null

        int[] arr2 = new int[50];
        arr2[0] = 100;
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

    }
}
