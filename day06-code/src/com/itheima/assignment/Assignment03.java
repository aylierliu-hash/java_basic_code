package com.itheima.assignment;

import java.util.Scanner;

public class Assignment03 {
    static void main(String[] args) {
        int num1, num2,num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        num1=sc.nextInt();
        System.out.println("请输入第二个整数：");
        num2=sc.nextInt();
        System.out.println("请输入第三个整数：");
        num3=sc.nextInt();

        getMax(num1,num2,num3);
    }

    public static void getMax(int a, int b, int c) {
        int max, mid, min = 0;
        if(a>b && a>c) {
            max = a;
            if(b>c) {
                mid = b;
                min = c;
            }else{
                mid = c;
                min = b;
            }
        }else if(b>c) {
            max = b;
            if(a>c) {
                mid = a;
                min = c;
            }else{
                mid = c;
                min = a;
            }
        }else {
            max = c;
            if(a>b) {
                mid = a;
                min = b;
            }else{
                mid = b;
                min = a;
            }
        }
        System.out.println("从大到小的顺序是："+max+" "+mid+" "+min+" ");
    }
}
