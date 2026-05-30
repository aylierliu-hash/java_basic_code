package com.itheima.switchDemo;
//JDK12新特性：switch表达式
public class switchDemo4 {
    public static void main(String[] args) {
        int number=1 ;
        switch(number){
            case 1 -> System.out.println("number的值为1");
            case 10 -> System.out.println("number的值为10");
            case 20 -> System.out.println("number的值为20");
            case 30 -> System.out.println("number的值为30");
            default -> System.out.println("number的值为其他");
        }
    }
}
