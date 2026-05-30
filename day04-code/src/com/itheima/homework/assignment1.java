package com.itheima.homework;

public class assignment1 {
    public static void main(String[] args) {
        int newPhone = 7988;
        int oldPhone = 1500;
        //不以旧换新的花费
        double cost_1 = newPhone - oldPhone;
        //以旧换新的花费
        double cost_2 = newPhone*0.8;

        System.out.println("不以旧换新的花费为: "+cost_1);
        System.out.println("以旧换新的花费为: "+cost_2);

        if(cost_1<cost_2){
            System.out.println("不使用及旧换新的方式更省钱");
        }else{
            System.out.println("使用及旧换新的方式更省钱");
        }
    }
}
