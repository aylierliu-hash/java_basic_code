package com.heima.a01staticDemo1;

public class Test {
    static void main(String[] args) {
        Student.setTeacherName("老师");

        Student student = new Student("张三", 18, "男");
        Student student1 = new Student("李四", 18, "男");

        System.out.println(student.getTeacherName());
        System.out.println(student1.getTeacherName());
    }
}
