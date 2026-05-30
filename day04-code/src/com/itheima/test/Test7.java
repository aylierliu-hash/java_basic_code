package com.itheima.test;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //注意格式
        double money = 1000;
        //键盘录入会员级别
        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt();

        if(level==1){
            money=money * 0.9;
        }else if(level==2){
            money=money * 0.8;
        }else if(level==3){
            money=money * 0.7;
        } else{
            System.out.println("非会员不打折，需要支付"+money);
        }

        System.out.println("会员级别为"+level+"的会员，购买商品后需要支付的金额为"+money);
    }
}
