package com.heima.test;

import java.util.ArrayList;

/**
 * 集合的遍历方式
 * 需求:定义一个集合，添加字符串，并进行遍历遍历格式参照:[元素1元素2，元素3]。
 */
public class Test1 {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.print(list.get(i)+"]");
            }else{
                System.out.print(list.get(i)+",");
            }
        }
    }
}
