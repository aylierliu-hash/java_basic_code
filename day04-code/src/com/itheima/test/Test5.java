package com.itheima.test;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ticket = sc.nextInt();

        if(ticket<=0||ticket>=100){
            System.out.println("输入错误");
        } else{
            if(ticket%2==0){
                System.out.println("坐右边");
            }else{
                System.out.println("坐左边");
            }
        }


    }
}
