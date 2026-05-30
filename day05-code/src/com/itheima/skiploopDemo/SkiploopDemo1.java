package com.itheima.skiploopDemo;

public class SkiploopDemo1 {
    public static void main(String[] args) {
        //跳过某一次循环
        for(int i=1;i<=5;i++){
            if(i==3){
                //结束本次循环，开始下次循环
                continue;
            }
            System.out.println(i);
        }
    }
}
