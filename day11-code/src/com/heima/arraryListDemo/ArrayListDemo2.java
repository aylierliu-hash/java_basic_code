package com.heima.arraryListDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        boolean isSuccess = list.add("hello");
        System.out.println(isSuccess);//true

        boolean isSuccess2 = list.add(null);
        System.out.println(isSuccess2);//true



        System.out.println(list);//[hello, null]


    }
}
