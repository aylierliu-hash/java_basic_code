package com.heima.a03staticDemo03;

public class TestDemo {
    static void main(String[] args) {
        Student[] students = {
                new Student("张三", 18, "男"),
                new Student("李四", 20, "男"),
                new Student("王五", 19, "男")
        };
        int maxAge = StudentUtil.getMaxAge(students);
        System.out.println(maxAge);
    }
}
