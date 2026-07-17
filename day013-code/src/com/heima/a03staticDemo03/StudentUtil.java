package com.heima.a03staticDemo03;

/**
 * 定义学生工具类
 * 需求:定义一个集合，用于存储3个学生对象。学生类的属性为:name、age、gender定义一个工具类，用于获取集合中最大学生的年龄。
 */
public class StudentUtil {
    //私有构造方法
    private StudentUtil() {

    }
    //提供一个工具类方法，用于获取集合中最大学生的年龄。
    public static int getMaxAge(Student[] students) {
        int maxAge = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getAge() > maxAge) {
                maxAge = students[i].getAge();
            }
        }
        return maxAge;
    }

}
