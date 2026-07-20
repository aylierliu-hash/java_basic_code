package com.heima.a04staticDemo04;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "张三";


        Student s1 = new Student();
        System.out.println("s1的地址值为:"+s1);
        s1.name = "李四";
        s1.age = 20;
        s1.show1();

        Student s2 = new Student();
        System.out.println("s2的地址值为:"+s2);
        s2.name = "王五";
        s2.age = 19;
        s2.show1();







    }
}
