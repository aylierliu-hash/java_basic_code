package com.itheima.homework;


import java.util.Scanner;

public class assignment34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number_1=sc.nextInt();
        int number_2=number_1;
        String number_3="";
        while(number_2!=0){
            int digit =  number_2%10;
            number_3+=digit+"";//这里能不能用强制转换？(note1)
            number_2/=10;
        }
        if(String.valueOf(number_1).equals(number_3)){//注意这里比较String类型时，要用equals而不是==(note2)
            System.out.println(number_1+"是回文数");
        }else {
            System.out.println(number_1+"不是回文数");
        }
    }
}
