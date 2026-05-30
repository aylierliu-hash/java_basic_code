package com.itheima.switchDemo;

import java.util.Scanner;

public class switchDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("周一：跑步");
                break;
            case 2:
                System.out.println("周二：游泳");
                break;
            case 3:
                System.out.println("周三： 慢走");
                break;
            case 4:
                System.out.println("周四： 动感单车");
                break;
            case 5:
                System.out.println("周五： 拳击");
                break;
            case 6:
                System.out.println("周六： 爬山");
                break;
            case 7:
                System.out.println("周日： 好好");
                break;
            default:
                System.out.println("输入错误");
        }

    }
}
