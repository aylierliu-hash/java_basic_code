package com.itheima.assignment;

public class Assignment02 {
    static void main(String[] args) {
        System.out.println(getMax(1, 2, 3));
    }

    public static int getMax(int a, int b, int c) {
        int max = a>b?a:b;
        max = max>c?max:c;
        return max;
    }
}
