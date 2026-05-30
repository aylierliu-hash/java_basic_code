package com.itheima.test;

public class Test18_1 {

     public static void main(String[] args) {
         int x = 1221;
         int temp = x;
         int num = 0;
         while(x!=0){
             int ge = x%10;
             x=x/10;
             num = num*10 + ge;
         }
         System.out.println(num==temp);

     }

}
