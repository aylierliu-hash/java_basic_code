package com.heima.extendsDemo.extendsDemo1;

public class AnimalTest {
    static void main(String[] args) {
        //创建对象并调用方法
        Ragdoll ragdoll = new Ragdoll();
        ragdoll.catchMouse();
        LiHua liHua = new LiHua();
        liHua.catchMouse();

        Husky husky = new Husky();
        husky.breakHome();
        Teddy teddy = new Teddy();
        teddy.fetchBall();
    }
}
