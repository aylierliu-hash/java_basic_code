package com.itheima.methodDemo;

public class MethodDemo1 {
    public static void main(String[] args) {
        playGame();
        System.out.println("游戏结束");
        System.out.println("重新开始游戏");
        playGame();
    }
    public static void playGame(){
        System.out.println("加载地图");
        System.out.println("加载角色");
        System.out.println("开始游戏");
    }
}
