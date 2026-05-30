package com.itheima.test;

import java.util.Random;

public class Test8 {
    public static void main(String[] args) {
        int[] lotteries = new int[]{2,588,888,1000,10000};

        getLottery(lotteries);
        getLottery(lotteries);
        getLottery(lotteries);
        getLottery(lotteries);
        getLottery(lotteries);
        getLottery(lotteries);
        getLottery(lotteries);

    }
    
    public static void getLottery(int[] lottery){
        if(isAllZero(lottery)){
            System.out.println("所有奖都被抽取完毕");
            return;
        }

        while(true){
            int index = new Random().nextInt(lottery.length);
            if(lottery[index]!=0){
                System.out.println(lottery[index]+"元的奖金被抽出");
                lottery[index]=0;
                break;
            }
        }
    }

    public static boolean isAllZero(int[] lottery){
        for (int i = 0; i < lottery.length; i++) {
            if (lottery[i] != 0) {
                return false;
            }
        }
        return true;
    }
    

}
