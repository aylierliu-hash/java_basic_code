package com.itheima.stringDemo;

/**
 * 身份证信息查看。
 * 7-14位:出生年、月、日
 * 17位:性别(奇数男性，偶数女性)
 * 人物信息为:出生年月日:XXXX年X月X日
 * 性别为:男/女
 */
public class StringDemo11 {
    static void main(String[] args) {
        String idCard="440304199001010011";
        System.out.println("人物信息为：");
        System.out.println("出生年月日:"+idCard.substring(6,10)+"年"+idCard.substring(10,12)+"月"+idCard.substring(12,14)+"日");
        System.out.println("性别为:"+(Integer.parseInt(idCard.charAt(16)+"")%2==1?"男":"女"));

//        char gender=idCard.charAt(16);
        //ASCII码表中，0-9的ASCII码值为48-57
        //'0'-->48
        //'1'-->49
        //'2'-->50
        //'3'-->51
        //'4'-->52
        //'5'-->53
        //'6'-->54
        //'7'-->55
        //'8'-->56
        //'9'-->57

//        int genderNum=gender-48;
//        int genderNum=gender-'0';
//        System.out.println("性别为:"+(genderNum%2==1?"男":"女"));


    }

}
