package com.itheima.stringDemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //方法1
        String str1 = "hello";
        System.out.println(str1);

        //方法2
        //2.1空参构造
        String str2 = new String();
        System.out.println("@" + str2+"@");

        //2.2有参构造
        //字符串创建字符串
        String str3 = new String("hello");
        System.out.println(str3);

        //字符数组创建字符串
        //应用：便于修改字符串的内容
        //因为字符串是不可变的，所以不能直接修改字符串的内容
        //但是可以将字符串转换为字符数组，修改字符数组的内容，再将字符数组转换为字符串
        char[] chars = {'h','e','l','l','o'};
        String str4 = new String(chars);
        System.out.println(str4);

        //字节数组创建字符串
        //应用：网络中传输的数据一般都是字节信息
        //将字节数组转换为人能读的字符串，就要用到这个构造方法了
        byte[] bytes = {104,101,108,108,111};
        String str5 = new String(bytes);
        System.out.println(str5);

    }
}
