package com.itheima.arithmaticoperater;

public class ArithmeticoperatorDemo2 {
        public static void main(String[] args) {
            //除法
            System.out.println(10 / 2);
            System.out.println(10 / 3);//3
            System.out.println(10.0 / 3);//3.3333333333333335

            //取模or取余操作
            System.out.println(10 % 2);//0
            System.out.println(10 % 3);//1
            //取模的应用
            //1.A是否可以被B整除
            //2.A是否为偶数
            //3.斗地主发牌
            //比如三个玩家，每个牌有一个序号，用序号模3，结果为0，1，2，分别对应玩家1，2，3
        }
}
