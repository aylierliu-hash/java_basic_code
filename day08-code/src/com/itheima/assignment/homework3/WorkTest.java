package com.itheima.assignment.homework3;

public class WorkTest {
    static void main(String[] args) {
        Manager m = new Manager();

        m.setName("张三");
        m.setId(1);
        m.setSalary(5000);
        m.setBonus(500);
        m.work();

        Coder c = new Coder();
        c.setName("张三");
        c.setId(1);
        c.setSalary(5000);
        c.work();

    }
}
