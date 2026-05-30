package com.itheima.test;

import java.util.Arrays;
import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        int[] userNum = getResult();
        int[] lotteryNum = getResult();
//        int[] lotteryNum = userNum.clone();

        System.out.println("用户抽取结果为：红球"+ Arrays.toString(Arrays.copyOfRange(userNum, 0, 5)) +"蓝球"+userNum[6]);
        System.out.println("中奖抽取结果为：红球"+Arrays.toString(Arrays.copyOfRange(lotteryNum, 0, 5))+"蓝球"+lotteryNum[6]);

        System.out.println("中奖奖金为："+getPrize(userNum,lotteryNum)+"元");
    }

    //判断某int不在int[]中
    public static boolean isIn(int[] arr, int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
    //获取红球号码数组
    public static int[] getReds(){
        //生成红球号码集合
        int[] redSet = new int[33];
        for(int i=0;i<redSet.length;i++){
            redSet[i] = i+1;
        }
        //随机获取6个红球
        int[] reds = new int[6];
        for(int i=0;i<reds.length;i++){
            int red = redSet[new Random().nextInt(redSet.length)];
            while(isIn(reds,red)){
                red = redSet[new Random().nextInt(redSet.length)];
            }
            reds[i] = red;
        }
        return reds;
    }
    //随机获取蓝球
    public static int getBlue(){
        return new Random().nextInt(16)+1;
    }
    //获取结果
    public static int[] getResult(){
        int[] results = new int[7];
        int[] reds = getReds();
        int blue = getBlue();
        for(int i=0;i<results.length;i++){
            if(i==results.length-1){
                results[i] = blue;
            }else {
                results[i] = reds[i];
            }
        }
        return results;
    }
    //比较结果
    public  static int getPrize(int[] userNum, int[] lotteryNum){
        int prize = 0;
        //检查中奖情况
        int countRed = 0;
        int countBlue = 0;
        for (int i = 0; i < userNum.length; i++) {
            if(i<userNum.length-1){
                for (int i1 = 0; i1 < userNum.length; i1++) {
                    if(userNum[i]==lotteryNum[i1]){
                        countRed++;
                    }
                }
            }else  if(i==userNum.length-1){
                if(userNum[i]==lotteryNum[i]){
                    countBlue++;
                }
            }
        }
        System.out.println("红球中奖数："+countRed);
        System.out.println("蓝球中奖数："+countBlue);

        //给出奖金分配
        if(countBlue==0){
            if(countRed==4){
                prize = 10;
            }else if(countRed==5){
                prize = 200;
            }else if(countRed==6){
                prize = 5000000;
            }else{
                prize = 0;
            }

        }else if(countBlue==1){
            if(countRed==0||countRed==1||countRed==2){
                prize = 5;
            }else if(countRed==3){
                prize = 10;
            }else if(countRed==4){
                prize = 200;
            }else if(countRed==5){
                prize = 3000;
            }else if(countRed==6){
                prize = 10000000;
            }else{
                prize = 0;
            }
        }
        return prize;
    }
}
