package com.itheima.Logicoperator;

public class LogicoperatorDmoe3 {
    public static void main(String[] args) {
        //短路与&&
        //运行结果和&相同
        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && true);//false
        System.out.println(false && false);//false

        //短路或||
        //运行结果和|相同
        System.out.println(true || true);//true
        System.out.println(true || false);//true
        System.out.println(false || true);//true
        System.out.println(false || false);//false

        //短路与的短路效果
        int a1 = 10;
        int b1 = 10;
        boolean result = ++a1 < 5 && ++b1 < 5;
        System.out.println(result);
        System.out.println(a1);
        System.out.println(b1);//变量b没有改变

        //和普通与比较
        int a2 = 10;
        int b2 = 10;
        result = ++a2 < 5 & ++b2 < 5;
        System.out.println(result);
        System.out.println(a2);
        System.out.println(b2);//变量b改变

//        //和普通与比较
//        int a2 = 10;
//        int b2 = 10;
//        result = a2++ < 5 & b2++ < 5;
//        System.out.println(result);
//        System.out.println(a2);
//        System.out.println(b2);//变量b改变


    }
}
