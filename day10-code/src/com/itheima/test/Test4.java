package com.itheima.test;

import java.util.Random;

/**
 * 作业3
 * 生成验证码
 * 内容：可以是小写字母，也可以是大写字母，还可以是数字
 * 规则：
 * 长度为5
 * 内容中是四位字母，1位数字。
 * 其中数字只有1位，但是可以出现在任意的位置。
 */
public class Test4 {
    static void main(String[] args) {
        System.out.println(generateCode());
        System.out.println(generateCode());
        System.out.println(generateCode());
    }

    public static String generateCode() {
        char[] chars = new char[5];
        char[] alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        Random random = new Random();

        chars[random.nextInt(5)] = (char) (random.nextInt(10) + '0');
        //注意只剩下四个位置，所以这里需要循环4次，而不是5次
        //否则while循环会无限循环
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(5);
            while (chars[index] != '\0') {
                index = random.nextInt(5);
            }
            chars[index] = alpha[random.nextInt(alpha.length)];
        }

        return new String(chars);
    }
}
