package com.itheima.test;

public class Test10_2 {
    public static void main(String[] args) {
        int[][] sales = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        countSales(sales);
    }

    public static void countSales(int[][] sales){
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            System.out.println("第"+(i+1)+"季度的总营业额为："+(sales[i][0]+sales[i][1]+sales[i][2]));
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        System.out.println("全年总营额为："+total);
    }
}
