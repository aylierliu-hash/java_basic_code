package com.itheima.arithmaticoperater;

public class ArithmeticoperatorDemo1 {
        public static void main(String[] args) {
            //+
            System.out.println(3+2);

            //-
            System.out.println(5-1);

            //*
            System.out.println(7*9);

            //如果在计算时有小数参与，结果有可能不精确!!!!
            System.out.println(1.1 + 1.01);//2.1100000000000003(?)
            System.out.println(1.1 - 1.01);
            System.out.println(1.1 * 1.01);
            System.out.println(1.1+1.1);
        }
}
