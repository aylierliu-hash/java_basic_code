package com.heima.a02staticDemo2;

import java.util.Scanner;

/**
 * 定义数组工具类
 * 需求:在实际开发中，经常会遇到一些数组使用的工具类。请按照如下要求编写一个数组的工具类:ArrayUtil
 * 提供一个工具类方法printArr，用于返回整数数组的内容。
 * 返回的字符串格式如:[10,20,50,34,100](只考虑整数数组，且只考虑一维数组)
 * 提供这样一个工具方法getAerage，用于返回平均分。(只考虑浮点型数组，且只考虑一维数组)
 * 定义一个测试类TestDemo，调用该工具类的工具方法，并返回结果。
 */
public class ArrayUtil {

    //私有化构造方法
    private ArrayUtil() {
    }

    //提供一个工具类方法printArr，用于返回整数数组的内容。
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    //提供这样一个工具方法getAerage，用于返回平均分。(只考虑浮点型数组，且只考虑一维数组)
    public static double getAerage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
