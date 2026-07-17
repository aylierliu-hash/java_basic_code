package com.heima.a02staticDemo2;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 34, 100};
        System.out.println(ArrayUtil.printArr(arr));

        double[] arr2 = {10.5, 20.3, 50.2, 34.1, 100.0};
        System.out.println(ArrayUtil.getAerage(arr2));
    }
}
