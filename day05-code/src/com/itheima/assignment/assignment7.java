package com.itheima.assignment;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class assignment7 {
    public static void main(String[] args) {
       int[] arr=new int[10];
       Random rand=new Random();
       for(int i=0;i<arr.length;i++){
           arr[i]=rand.nextInt(100);
       }
       int[] sorted_arr=new int[10];
       int oddIndex=0;
       int evenIndex=sorted_arr.length-1;
       for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==1){
                sorted_arr[oddIndex]=arr[i];
                oddIndex++;
            }
            if(arr[i]%2==0){
                sorted_arr[evenIndex]=arr[i];
                evenIndex--;
            }
        }
        System.out.println(Arrays.toString(sorted_arr));
    }
}
