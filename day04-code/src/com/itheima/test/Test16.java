package com.itheima.test;

import java.util.Scanner;

public class Test16 {

     public static void main(String[] args) {
        System.out.println("请从小到大输入两个数字表示一个范围：");
        Scanner sc = new Scanner(System.in);
        int count= 0, top = 0, bottom = 0;
        bottom = sc.nextInt();
        top = sc.nextInt();
        if(top<bottom){
            System.out.println("输入错误");
        } else {
            for(int i =bottom;i<=top;i++){
                if(i%3==0 && i%5==0){
                    count+=1;
                    System.out.println(i);
                }
            }
            System.out.println("在这个范围内既能被3整除又能被5整除的数有："+count+"个");
        }
    }

}
