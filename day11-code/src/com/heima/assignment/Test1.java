package com.heima.assignment;

import java.util.ArrayList;

public class Test1 {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
