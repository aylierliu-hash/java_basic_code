package com.heima.arraryListDemo;

import java.util.ArrayList;

public class ArrayListDemo2_4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("bbb");
        list.add("ccc");

        System.out.println(list.get(1));
    }
}
