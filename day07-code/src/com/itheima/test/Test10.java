package com.itheima.test;

import java.util.Random;

public class Test10 {
    public static void main(String[] args) {

        int[][] arr1 = new int[][]{{1,2,3},{4,5,6,7,8}};
        int[][] arr2 = {{1,2,3},{4,5,6,7,8}};
        //以后建议这样书写，更加清晰
        int[][] arr3 = {
                {1,2,3},
                {4,5,6,7,8}
        };

        System.out.println(arr3[0][2]);


        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                //打印横向一行
                System.out.print(arr3[i][j]+" ");
            }
            //每打印一行再换行
            System.out.println();
        }
    }

}
