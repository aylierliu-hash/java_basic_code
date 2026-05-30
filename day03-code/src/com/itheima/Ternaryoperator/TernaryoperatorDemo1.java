package com.itheima.Ternaryoperator;
import java.util.Scanner;

public class TernaryoperatorDemo1 {
    public  static void main(String[] args) {
        //三元运算符

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = a > b ? a : b;
        System.out.println(max);
    }
}
