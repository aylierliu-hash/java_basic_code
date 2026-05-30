package com.itheima.test1;

public class RoleTest {
    static void main(String[] args) {
        Role role1 = new Role();
        Role role2 = new Role();

        role1.setName("乔峰");
        role1.setBlood(100);

        role2.setName("鸠摩智");
        role2.setBlood(100);

        role1.attack(role1, role2, 10);
        role2.attack(role2, role1, 10);
        role1.attack(role1, role2, 100);

        System.out.printf("");
    }
}
