package com.itheima.skiploopDemo;

public class SkiploopDemo2 {
    public static void main(String[] args) {
        //跳过某一次循环
        for(int i=1;i<=5;i++){
            if(i==3){
                //结束循环
                break;
            }
            System.out.println(i);
        }
    }
}
