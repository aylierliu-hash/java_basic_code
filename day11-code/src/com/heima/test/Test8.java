package com.heima.test;

import java.util.ArrayList;

/**
 * 添加手机对象并返回要求的数据
 * 需求:
 * 定义Javabean类:Phone
 * Phone属性:品牌，价格。
 * main方法中定义一个集合，存入三个手机对象。
 * 分别为:小米，1000。苹果，8000。锤子2999。
 * 定义一个方法，将价格低于3000的手机信息返回。
 */
public class Test8 {
    static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        list.add(new Phone("小米", 1000));
        list.add(new Phone("苹果", 8000));
        list.add(new Phone("锤子", 2999));

        ArrayList<Phone> resultList = getPriceBelow3000(list);
        System.out.println(resultList);
    }

    public static ArrayList<Phone> getPriceBelow3000(ArrayList<Phone> list){
        if(list.isEmpty()){
            System.out.println("集合为空");
            return null;
        }

        ArrayList<Phone> resultList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Phone phone = list.get(i);
            if(phone.getPrice() < 3000){
                resultList.add(phone);
            }
        }
        return resultList;
    }

}
