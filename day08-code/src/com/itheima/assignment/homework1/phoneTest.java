package com.itheima.assignment.homework1;

public class phoneTest {
    static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();

        phone1.setBrand("小米");
        phone1.setPrice(1999);
        phone1.setColor("黑色");

        phone2.setBrand("华为");
        phone2.setPrice(5999);
        phone2.setColor("蓝色");

        phone1.call();
        phone1.sendMessage();

        phone2.call();
        phone2.sendMessage();
    }
}
