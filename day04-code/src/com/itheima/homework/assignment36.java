package com.itheima.homework;


public class assignment36 {
    public static void main(String[] args) {
        System.out.println("从1949年到2019年中所有是猪年的年份有：");
//        System.out.println(2019);
        for(int i=2019;i>=1949;i-=12){
            System.out.println(i);//注意初始会执行一次
        }
    }
}
