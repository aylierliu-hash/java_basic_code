package com.heima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+(i+1)+"个学生的姓名和年龄");
            String name = sc.next();
            int age = sc.nextInt();
            list.add(new Student(name, age));
        }

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.print(list.get(i)+"]");
            }else{
                System.out.print(list.get(i)+",");
            }
        }
    }
}
