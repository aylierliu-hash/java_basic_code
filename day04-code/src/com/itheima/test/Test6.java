package com.itheima.test;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        //对异常数据校验
        if(score<0||score>100){
            System.out.println("输入错误");
        }else {
            if(score >= 95){
                System.out.println("送一辆自行车");
            }else if(score >= 90){
                System.out.println("去游乐场");
            }else if(score >= 80){
                System.out.println("送变形金刚");
            }else{
                System.out.println("收拾一顿");
            }
        }




    }
}
