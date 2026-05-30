package com.itheima.homework;


public class assignment37 {
    public static void main(String[] args) {
        System.out.println("从1988年到2019年的所有闰年年份有：");
        for(int i=1988;i<=2019;i++){
            if(i%4==0){
                if(i%100==0){
                    if(i%400==0){
                        System.out.println(i);
                    }
                }else {
                    System.out.println(i);
                }
            }
        }
    }
}
