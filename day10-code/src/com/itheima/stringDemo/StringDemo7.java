package com.itheima.stringDemo;

import java.util.Arrays;

/**
 * 拼接字符串
 * 定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台输出结果。例如:
 * 数组为int[]arr={1,2,3);
 * 执行方法后的输出结果为:[1,2,3]
 */
public class StringDemo7 {

    static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(intArrToStr(arr));
    }

    public static String intArrToStr(int[] arr){
        if(arr==null){
            return "";
        }
        if(arr.length==0){
            return "[]";
        }

        String result="[";
        for(int i=0;i<arr.length;i++){
            result+=arr[i];
            if (i!=arr.length-1) {
                result+=", ";
            }
        }
        result+="]";
        return result;
    }
}
