package com.itheima.test2_5;

public class StudentTest {
    static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student("1001", "张三", 18);
        students[1] = new Student("1002", "李四", 19);
        students[2] = new Student("1003", "王五", 20);

        Student s1 = new Student("1001", "张三", 18);
        Student s2 = new Student("1004", "李四", 19);

        

    }
}
