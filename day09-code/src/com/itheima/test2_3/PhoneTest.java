package com.itheima.test2_3;

public class PhoneTest {
    static void main(String[] args) {
        Phone[] phones = new Phone[3];
        phones[0] = new Phone("华为", 5000, "黑色");
        phones[1] = new Phone("小米", 3000, "蓝色");
        phones[2] = new Phone("苹果", 8000, "白色");

        double sum = 0;
        for (int i = 0; i < phones.length; i++) {
            sum += phones[i].getPrice();
        }
        double avg = sum / phones.length;
        System.out.println("平均价格：" + avg);
    }
}
