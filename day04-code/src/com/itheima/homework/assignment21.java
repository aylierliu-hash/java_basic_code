package com.itheima.homework;

import java.util.Scanner;

public class assignment21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int operand_1=sc.nextInt();
        System.out.println("请输入第二个整数：");
        int operand_2=sc.nextInt();
        System.out.println("您可以选择以下运算");
        System.out.println("1:表示加法运算\n2:表示减法运算\n3:表示乘法运算\n4:表示除法运算");
        System.out.println("请选择您想要进行的操作：");
        int operator =  sc.nextInt();
        switch (operator){
            case 1 -> System.out.println(operand_1+"+"+operand_2+"="+(operand_1+operand_2));
            case 2 -> System.out.println(operand_1+"-"+operand_2+"="+(operand_1-operand_2));
            case 3 -> System.out.println(operand_1+"*"+operand_2+"="+(operand_1*operand_2));
            case 4 -> System.out.println(operand_1+"/"+operand_2+"="+(operand_1/operand_2));
            default -> System.out.println("输入错误");
        }
    }
}
