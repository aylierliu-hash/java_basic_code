package com.itheima.assignment;

import java.util.Arrays;
import java.util.Random;

public class assignment7_1 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Random rand=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                for (int j = arr.length - 1; j >= i; j--) {
                    if(arr[j]%2==1){
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
