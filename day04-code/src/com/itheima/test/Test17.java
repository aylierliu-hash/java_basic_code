package com.itheima.test;

import java.util.Scanner;

public class Test17 {

     public static void main(String[] args) {
       double hight = 0.1;
       int count = 0;
       while(hight<=8844430){
           hight*=2;
           count++;
       }
         System.out.println("需要折叠"+count+"次");
    }

}
