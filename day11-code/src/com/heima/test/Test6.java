package com.heima.test;

import java.util.ArrayList;

/**
 * 添加用户对象并判断是否存在
 * 需求:
 * 1，main方法中定义一个集合，存入三个用户对象。
 * 用户属性为:id,username,password
 * 2，要求:定义一个方法，根据id查找对应的用户信息。
 * 如果存在，返回true
 * 如果不存在，返回false
 */
public class Test6 {
    static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("1", "张三", "123456"));
        list.add(new User("2", "李四", "654321"));
        list.add(new User("3", "王五", "123456"));

        System.out.println(findUserById(list, "1"));
        System.out.println(findUserById(list, "2"));
        System.out.println(findUserById(list, "3"));
        System.out.println(findUserById(list, "4"));
    }

    public static boolean findUserById(ArrayList<User> list, String id){
        for (int i = 0; i < list.size(); i++) {
            String uid = list.get(i).getId();
            if(uid.equals(id)){
                System.out.println("用户存在");
                System.out.println(list.get(i));
                return true;
            }
        }
        System.out.println("用户不存在");
        return false;
    }
}
