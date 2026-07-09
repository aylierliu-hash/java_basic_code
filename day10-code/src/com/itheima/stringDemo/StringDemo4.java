package com.itheima.stringDemo;

import java.util.Scanner;

/**
用户登录
需求:已知正确的用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示
**/
public class StringDemo4 {
    public static void main(String[] args) {
        String rightUsername = "admin";
        String rightPassword = "123";

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String username = sc.nextLine();
            System.out.println("请输入密码:");
            String password = sc.nextLine();
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("登录成功");
                return;
            }else {
                if (i == 2) {
                    System.out.println("账号“" + username + "”已被锁定，请联系管理员解锁");
                } else {
                    System.out.println("用户名或密码错误");
                    System.out.println("还有 " + (2 - i) + "次机会");
                }
            }
        }

    }
}
