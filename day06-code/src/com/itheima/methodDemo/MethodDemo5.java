package com.itheima.methodDemo;

public class MethodDemo5 {
    public static void main(String[] args) {

        getSum(10,20,30);

        double sum=getSum(10,20,30);
        System.out.println(sum);

        System.out.println(getSum(10,20,30));

    }

    public static double getSum(int num1,int num2,int num3){
        double result=num1+num2+num3;
        return result;
    }
}
