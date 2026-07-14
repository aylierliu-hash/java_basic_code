package com.heima.arraryListDemo;

import java.util.ArrayList;

public class ArrayListDemo2_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Integer i = 100;
        boolean isSuccess = list.add(i);
        System.out.println(isSuccess);//true

        isSuccess = list.add(100);
        System.out.println(isSuccess);//true

        isSuccess = list.add(null);
        System.out.println(isSuccess);//true

        System.out.println(list);//[100, 100, null]

    }
}
