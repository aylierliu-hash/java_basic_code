package com.itheima.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(getVerificationCode());
    }

    public static String getVerificationCode(){
        String VerificationCode="";
        char[] codeSet=new char[52];
//        for(int i=0;i<26;i++){
//            codeSet[i]=(char)(65+i);
//        }
//        for(int i=0;i<26;i++){
//            codeSet[i+26]=(char)(97+i);
//        }
        for(int i=0;i<52;i++){
            if(i<=25){
                codeSet[i]=(char)(97+i);
            }else{
                codeSet[i]=(char)(65+i-26);
            }
        }

        Random rand=new Random();
        for(int i=0;i<4;i++){
            VerificationCode+=codeSet[rand.nextInt(codeSet.length)];
        }
        VerificationCode+=rand.nextInt(10)+"";

        return VerificationCode;
    }


}
