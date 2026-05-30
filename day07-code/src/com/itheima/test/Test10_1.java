package com.itheima.test;

public class Test10_1 {
    public static void main(String[] args) {

        //动态初始化
        //动态创建二位数组
        int[][] arr = new int[3][5];
        //给二位数组赋值元素
        arr[0][0] = 1;
        //遍历二维数组：内循环和外循环
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
