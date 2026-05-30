package com.itheima.homework;

public class q3 {
    public static void main(String[] args) {
        //第一种购买方式
        double purchase1 = 24 + 8 +3;
        purchase1 = purchase1>=30 ? purchase1 * 0.8:purchase1;

        double purchase2 = 16 + 8 + 3;

        String result = purchase1<purchase2 ? "第一种购买方式更优惠" : "第二种购买方式更优惠";
        System.out.println(result);

        //验证
        System.out.println("第一种购买方式的金额是：" + purchase1);
        System.out.println("第二种购买方式的金额是：" + purchase2);
    }
}
