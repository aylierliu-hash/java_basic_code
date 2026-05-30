package com.itheima.assignment;

public class assignment5 {
    public static void main(String[] args) {
        int[] arr = new int[]{72, 89, 65, 87, 71, 82, 71, 93, 76, 68};
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            average+=arr[i];
        }
        average/=arr.length;
        System.out.println(average);
    }
}
