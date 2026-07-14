package com.itheima.test;

/**
 * 作业6
 * 我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。
 * 请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
 * 规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(isIdCardValid("44030419900101001X"));
        System.out.println(isIdCardValid("440304199001010011"));
        System.out.println(isIdCardValid("4403041990a1010011"));
        System.out.println(isIdCardValid("040304199001010011"));
    }

    public static boolean isIdCardValid(String idCard) {
        //先非空判断
        if (idCard == null) return false;
        if (idCard.length() != 18) return false;
        if (idCard.charAt(0) == '0') return false;
        for (int i = 1; i < idCard.length()-1; i++) {
            if (idCard.charAt(i) < '0' || idCard.charAt(i) > '9') return false;
        }
        if ((idCard.charAt(idCard.length()-1) < '0' || idCard.charAt(idCard.length()-1) > '9') && idCard.charAt(idCard.length()-1) != 'X') return false;
        return true;
    }
}
