package com.itheima.loopdemo;

public class WhileDemo1 {
    //计算1到100的和
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while(i<=100){
            sum+=i;
            i++;
        }
        System.out.println("1到100的和为："+sum);
    }
}
