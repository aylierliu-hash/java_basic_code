package com.itheima.test;

import java.util.Arrays;
import java.util.Random;

public class Test5_5 {
    public static void main(String[] args) {
        int[] scores = new int[6];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = new Random().nextInt(100);
        }
        double avg = 0;
        for (int i = 0; i < scores.length; i++) {
            avg += scores[i];
        }
        avg -= getMax(scores)+getmin(scores);
        avg/=4;
        System.out.println("选手得分为："+avg);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {}
        }
        return max;
    };

    public static int getmin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {}
        }
        return min;
    };




}
