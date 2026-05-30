package com.itheima.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class assignment6 {
    public static void main(String[] args) {
        int[] arr=new int[]{12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数数字：");
        int num=sc.nextInt();
        int[] new_arr =  new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            new_arr[i]=arr[i];
        }
        new_arr[arr.length]=num;
        for (int i = new_arr.length - 1; i >0; i--) {
            int temp = new_arr[i];
            if(new_arr[i-1]>temp){
                new_arr[i]=new_arr[i-1];
                new_arr[i-1]=temp;
            }
        }
        System.out.println(Arrays.toString(new_arr));
    }
}
