package com.heima.assignment;

import java.util.ArrayList;

public class Test2 {
    static void main() {
        ArrayList<Teacher> list = new ArrayList<>();
        list.add(new Teacher("赵老师", "javaee"));
        list.add(new Teacher("钱老师", "javase"));
        list.add(new Teacher("孙老师", "php"));
        list.add(new Teacher("李老师", "python"));

        for (int i = 0; i < list.size(); i++) {
            Teacher t = list.get(i);
            System.out.println("姓名：" + t.getName() + "，专业：" + t.getMajor());
        }
    }
}
