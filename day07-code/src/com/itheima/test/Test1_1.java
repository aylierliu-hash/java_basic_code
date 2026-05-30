package com.itheima.test;

import java.util.Scanner;

public class Test1_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入机票价格：");
        double ticket=sc.nextDouble();
        System.out.println("请输入当前月份：");
        int month=sc.nextInt();
        System.out.println("请问购买舱型是：1.头等舱 2.经济舱");
        int seat=sc.nextInt();

        printPrice(ticket,month,seat);
    }

    public static void printPrice(double ticket, int month, int seat){
        if(5<=month&&month<=10){
            ticket = getPrice(ticket, seat,  0.9, 0.85);
        }else if(1<=month&&month<=4||11<=month&&month<=12){
            ticket = getPrice(ticket, seat,  0.7, 0.65);
        }else{
            System.out.println("月份输入错误");
            return;
        }
        System.out.println("折后价格为："+ticket);
    }

    public static double getPrice(double ticket, int seat, double discount1, double discount2){
        if(seat==1) {
            ticket*=discount1;
        }else if(seat==2){
            ticket*=discount1;

        }else{
            System.out.println("舱型输入错误");
            return 0;
        }
        return ticket;
    }
}
