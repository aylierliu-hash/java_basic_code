package com.heima.test;

import java.util.ArrayList;

/**
 * 添加用户对象并判断是否存在
 * 需求:
 * 1，main方法中定义一个集合，存入三个用户对象。
 * 用户属性为:id,username,password
 * 2，要求:定义一个方法，根据id查找对应的用户信息。
 * 进一步查找：找到返回其索引值，未找到返回-1
 */
public class Test7 {
    static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("001", "张三", "123456"));
        list.add(new User("002", "李四", "654321"));
        list.add(new User("003", "王五", "123456"));

        System.out.println(getIndex(list, "001"));
        System.out.println(getIndex(list, "002"));
        System.out.println(getIndex(list, "003"));
        System.out.println(getIndex(list, "004"));
    }

    public static int getIndex(ArrayList<User> list, String id){
        for (int i = 0; i < list.size(); i++) {
            String uid = list.get(i).getId();
            if(uid.equals(id)){
                System.out.println("用户存在");
                System.out.println(list.get(i));
//                return i;
                return list.indexOf(list.get(i));
            }
        }
        System.out.println("用户不存在");
        return -1;
    }
}
