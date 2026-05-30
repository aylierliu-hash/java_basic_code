package com.itheima.test;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        int[] scores = new int[6];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = new Random().nextInt(100);
        }

        int max = scores[0];
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
        }

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == max) {
                scores[i] = 0;
            }
        }

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == min) {
                scores[i] = 0;
            }
        }

        double avg = 0;
        for (int i = 0; i < scores.length; i++) {
            avg += scores[i];
        }

        avg /= 4;

        System.out.println("选手得分为："+avg);
    }




}
