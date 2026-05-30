package com.itheima.homework;
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int ge = a%10;
        int shi = a/10%10;
        int bai = a/100%10;
        System.out.println(ge+shi+bai);
    }
}
