package com.heima.arraryListDemo;

import java.util.ArrayList;

public class ArrayListDemo2_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("bbb");
        list.add("ccc");

        System.out.println(list);
        //删除指定元素
        boolean isSuccess = list.remove("bbb");
        System.out.println(isSuccess);
        System.out.println(list);
        //删除不存在的元素，返回false
        isSuccess = list.remove("ddd");
        System.out.println(isSuccess);
        System.out.println(list);
        //删除指定索引的元素，返回被删除的元素
        String removeElement = list.remove(0);
        System.out.println(removeElement);
        System.out.println(list);

    }
}
