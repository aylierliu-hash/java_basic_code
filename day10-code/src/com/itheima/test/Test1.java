package com.itheima.test;

import java.util.Scanner;

/**
 * 转换罗马数字
 * 键盘录入一个字符串，
 * 要求1:长度为小于等于9
 * 要求2:只能是数字
 * 将内容变成罗马数字
 * 下面是阿拉伯数字跟罗马数字的对比关系:
 * I-1,II -2,III -3,IV-4,V-5,VI-6,VII -7,VIII -8,IX-9
 * 注意点:
 * 罗马数字里面是没有0的
 * 如果键盘录入的数字包含0，可以变成""(长度为0的字符串)
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            str = sc.nextLine();
            if (check(str)) {
                break;
            }
            System.out.println("输入格式错误，请重新输入");
        }
        System.out.println(convertToRoman(str));

    }

    public static boolean check(String str) {
        if(str==null||str.length()==0){
            return false;
        }
        if(str.length()>9){
            System.out.println("长度不能大于9");
            return false;
        }
        if(!str.matches("[0-9]+")){
            System.out.println("只能是数字");
            return false;
        }
        //判断是否是数字的另一种方法
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if(c<='0'||c>='9'){
//                return false;
//            }
//        }
        return true;
    }

    public static String convertToRoman(String str) {
        String[] romans = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(romans[str.charAt(i)-'0']);
            if (i!=str.length()-1) {
                result.append("-");
            }
        }
        return result.toString();
    }

    //可以使用switch实现，对每个字符进行判断
    public static String convertToRoman2(char number) {
        String result = switch (number) {
            case '0'->"";
            case '1'->"I";
            case '2'->"II";
            case '3'->"III";
            case '4'->"IV";
            case '5'->"V";
            case '6'->"VI";
            case '7'->"VII";
            case '8'->"VIII";
            case '9'->"IX";
            default->"";
        };
        return result;
    }
}
