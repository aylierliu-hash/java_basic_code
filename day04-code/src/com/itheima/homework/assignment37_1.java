package com.itheima.homework;


public class assignment37_1 {
    public static void main(String[] args) {
        System.out.println("从1988年到2019年的所有闰年年份有：");
        //1. 定义对年份的循环
        for (int year = 1988; year <= 2019; year++) {
            //2. 判断当年是否符合闰年条件
            if((year%4 == 0 && year%100 != 0) || year%400 == 0){
                System.out.println(year + "是闰年");
            }
        }
    }
}
