package com.itheima.stringBuilderDemo;

import java.util.Scanner;

/**
 *拼接字符串
 * 需求:定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回。
 * 调用该方法，并在控制台输出结果。
 * 例如:数组为int[]arr={1,2,3);
 * 执行方法后的输出结果为:[1,2,3]
 */
public class StringBuilderDemo6 {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        String str=concatArray(arr);
        System.out.println(str);

        int[] arr2={};
        str=concatArray(arr2);
        System.out.println(str);

        int[] arr3=null;
        str=concatArray(arr3);
        System.out.println(str);
    }
    public static String concatArray(int[] arr){
        //判断数组是否为空
        if(arr==null||arr.length==0){
            return "[]";
        }
        StringBuilder sb=new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                sb.append(arr[i]);
                sb.append("]");
            }else {
                sb.append(arr[i]);
                sb.append(",");
            }

        }
        return sb.toString();
    }
}
