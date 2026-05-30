package com.itheima.switchDemo;

import java.util.Scanner;

public class switchDemo2_2 {
    public static void main(String[] args) {
        int number=1 ;
        switch(number){
            case 1:
                System.out.println("number的值为1");
                break;
            case 10:
                System.out.println("number的值为10");
                break;
            case 20:
                System.out.println("number的值为20");
                break;
            default:
                System.out.println("number的值为其他");
                break;
        }

    }
}
