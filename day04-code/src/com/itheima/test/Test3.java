package com.itheima.test;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        if(money>=100){
            System.out.println("去网红餐厅");
        }else{
            System.out.println("去沙县小吃");
        }
    }
}
