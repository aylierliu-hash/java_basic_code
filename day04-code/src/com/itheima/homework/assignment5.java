package com.itheima.homework;

import java.util.Scanner;

public class assignment5 {
    public static void main(String[] args) {
        //输入税前工资
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入税前工资：");
        double pretaxSalary=sc.nextDouble();
        double tax = 0;
        double netSalary=0;
        //给出各个梯度交满税的税值
        //具体梯度比例如下
        //1. 0 ~ 3000元的部分，交税3%
        //2. 3000 ~ 12000元的部分，交税10%
        //3. 12000 ~ 25000的部分 ， 交税20%
        //4. 25000 ~ 35000的部分，交税25%
        //5. 35000 ~ 55000的部分，交税30%
        //6.55000 ~ 80000的部分，交税35%
        //超过80000的部分，交税45%
        //计算各个梯度满税值
        double taxPart_1 = 3000*0.03;
        double taxPart_2 = (12000-3000)*0.10;
        double taxPart_3 = (25000-12000)*0.20;
        double taxPart_4 = (35000-25000)*0.25;
        double taxPart_5 = (55000-35000)*0.30;
        double taxPart_6 = (80000-55000)*0.35;
        //先去掉三险一金和起征点，这里是税前工资的10%
        tax=pretaxSalary-pretaxSalary*0.1-5000;
        if(tax>80000){
            tax=(tax-80000)*0.45+taxPart_1+taxPart_2+taxPart_3+taxPart_4+taxPart_5+taxPart_6;
        }else if(tax>55000){
            tax=(tax-55000)*0.35+taxPart_1+taxPart_2+taxPart_3+taxPart_4+taxPart_5;
        }else if(tax>35000){
            tax=(tax-35000)*0.30+taxPart_1+taxPart_2+taxPart_3+taxPart_4;
        }else if(tax>25000){
            tax=(tax-25000)*0.25+taxPart_1+taxPart_2+taxPart_3;
        }else if(tax>12000){
            tax=(tax-12000)*0.20+taxPart_1+taxPart_2;
        }else if(tax>3000){
            tax=(tax-3000)*0.10+taxPart_1;
        }else if(tax>0){
            tax=(tax-0)*0.03;
        }else{
            tax=0;
        }

        netSalary = pretaxSalary-tax-pretaxSalary*0.10;
        System.out.println("应当纳税数额是："+tax+"元"+"税后工资是："+netSalary+"元");
    }
}
