package com.itheima.homework;

public class q1 {
    public static void main(String[] args) {
        //使用小数定义父母身高，计算公式中含有小数！！！！
        //注意格式，保持小数，不然格式转换过程中会丢失数据
        //欸等等，int会被转化为double对叭，所以其实不用转换？(代码试验没问题)
        int momHeight = 165;
        int dadHeight = 170;
        double sonHeight = (momHeight + dadHeight) * 1.08 / 2;
        System.out.println("儿子身高是：" + sonHeight);
        double daughterHeight = (momHeight *0.932 + dadHeight) / 2;
        System.out.println("女儿身高是：" + daughterHeight);
    }
}
