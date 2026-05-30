package com.itheima.test;

import java.util.Random;

public class Test8_1 {
    public static void main(String[] args) {
        int[] lotteries = new int[]{2,588,888,1000,10000};

        Random random = new Random();

        for (int i = 0; i < lotteries.length; i++) {
            int randomIndex = random.nextInt(lotteries.length);
            int temp = lotteries[i];
            lotteries[i] = lotteries[randomIndex];
            lotteries[randomIndex] = temp;
        }

        for (int i = 0; i < lotteries.length; i++) {
            System.out.println(lotteries[i]+"元的奖金被抽出");
        }
    }
}
