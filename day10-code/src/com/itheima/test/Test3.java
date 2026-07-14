package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

/**
 * 作业2
 * 键盘输入任意字符串，打乱其内容
 */
public class Test3 {
    static void main(String[] args) {
        System.out.println("请输入任意字符字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(shuffle(str));

    }

    public static String shuffle(String str) {
        char[] chars = new char[str.length()];
        Random random = new Random();
        for (int i = 0; i < str.length(); i++) {
            //注意这里不要直接给index赋值为0，否则字符串的第一个字符还是在第一个位置
            int index = random.nextInt(chars.length);
            //注意字符数组在初始化的时候，会自动填充'\0'，所以这里需要判断是否为'\0'，如果是，说明该位置已经被使用了
            while (chars[index] != '\0') {
                //左闭右开取到0
                index = random.nextInt(chars.length);
            }
            chars[index] = str.charAt(i);
        }
        return new String(chars);
    }
}
