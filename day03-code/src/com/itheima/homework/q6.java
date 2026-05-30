package com.itheima.homework;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();

        boolean c = a==6||b==6||((a+b)%6==0);
        System.out.println(c);
    }
}
