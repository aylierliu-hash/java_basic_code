package com.itheima.test;

import java.util.Random;

public class Test3_1 {
    public static void main(String[] args) {
        System.out.println(getVerificationCode());
    }

    public static String getVerificationCode(){
        String VerificationCode="";
        Random rand=new Random();

        char[] codeSet=new char[62];
        for(int i=0;i< codeSet.length;i++){
            if(i<=25){
                codeSet[i]=(char)(97+i);
            }else if(i<=51){
                codeSet[i]=(char)(65+i-26);
            }else{
                codeSet[i]=(char)(i+48-51);
            }
        }
        //这样可能出现两个数字，和随机位置数字要求不符合
        for(int i=0;i<5;i++){
            VerificationCode+=codeSet[rand.nextInt(codeSet.length)];
        }

        return VerificationCode;
    }


}
