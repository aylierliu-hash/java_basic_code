package com.heima.arraryListDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //尖括号内为泛型，这里的泛型为Integer，所以list只能存储Integer类型的对象
        //如果这里尖括号内为String，那么list只能存储String类型的对象
        //泛型可以类比方法的参数，传入这个“类型”，只能存储这个类型的对象
        //JDK7之前是这么写
        ArrayList<Integer> list = new ArrayList<Integer>();
        //JDK7之后可以这么写，后面可以省略泛型但是要保留尖括号
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println(list);//[]
        System.out.println(list2);//[]
    }
}
