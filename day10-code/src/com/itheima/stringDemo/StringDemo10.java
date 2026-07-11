package com.itheima.stringDemo;

/**
 * 手机号屏蔽
 * 例如13800000000，屏蔽为138****0000
 */
public class StringDemo10 {
    static void main(String[] args) {
        String str="13800000000";
        System.out.println(maskPhone(str));
    }

    public static String maskPhone(String phone){
        if(phone==null){
            return "";
        }
        if(phone.length()!=11) {
            System.out.println("手机号格式错误");
            return phone;
        }

        return phone.substring(0,4)+"****"+phone.substring(7);

    }
}
