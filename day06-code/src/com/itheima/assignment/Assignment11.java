package com.itheima.assignment;

import java.util.Random;

public class Assignment11 {
    static void main(String[] args) {
        //不能在指定数组大小的同时使用花括号初始化元素。
        int[] hongbao = new int[]{2,588,888,1000,10000};
        lottery(hongbao);
        lottery(hongbao);
        lottery(hongbao);
        lottery(hongbao);
        lottery(hongbao);

    }

    public static void lottery(int[] hongbao) {
//        for (int i = 0; i < hongbao.length; i++) {
//            if(hongbao[i]!=0){
//
//            }
//        }
        Random random = new Random();
        int index = 0;
        while(hongbao[index] == 0){
            index = random.nextInt(hongbao.length);
        }
        System.out.println(hongbao[index]+"元奖金被抽出");
        hongbao[index] = 0;
    }

}
