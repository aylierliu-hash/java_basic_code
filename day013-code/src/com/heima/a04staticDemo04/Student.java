package com.heima.a04staticDemo04;

public class Student {

    String name;
    int age;
    static String teacherName;


    //this表示当前方法调用者的地址值
    //this可以理解为一个特殊变量
    //this由虚拟机赋值
    public void show1(Student this){
        System.out.println("this的地址值为:"+this);
        //这里的name默认是this.name
        System.out.println("姓名:" + name+"年龄:"+age+"教师姓名:"+teacherName);

        //调用show2方法
        this.show2();
        method();

    }

    public void show2(){
        System.out.println("show2方法");
    }

    public static void method(){

        System.out.println("静态方法");
    }
}
