package com.itheima.stringDemo;

/**
 * 敏感词替换
 */
public class StringDemo12 {
    static void main(String[] args) {
        //获取说的话
        String talk = "这是一句脏话，TMD，TNND，MLGB";
        //定义敏感词库
        String[] sensitiveWords = {"TMD","TNND","MLGB"};
        //替换脏话
        for (String sensitiveWord : sensitiveWords) {
            talk = talk.replace(sensitiveWord,"***");
        }
        //打印结果
        System.out.println(talk);
    }

}
