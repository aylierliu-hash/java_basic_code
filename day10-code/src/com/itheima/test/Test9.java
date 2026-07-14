package com.itheima.test;

/**
 * 在String类的API中，有如下两个方法：
 *
 * // 查找参数字符串str在调用方法的字符串中第一次出现的索引，如果不存在，返回-1
 * public int indexOf(String str)
 *
 * // 截取字符串，从索引beginIndex（包含）开始到字符串的结尾
 * public String substring(int beginIndex)
 * 请仔细阅读API中这两个方法的解释，完成如下需求。
 *
 * 现有如下文本：“Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的”。请编写程序，统计该文本中"Java"一词出现的次数。
 */
public class Test9 {
    public static void main(String[] args) {
        String str = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的";
        System.out.println(count(str, "Java"));
        String str2 = "四是四，十是十，十四是十四，四十是四十。莫把四字说成十，休将十字说成四。若要分清四十和十四，经常练说十和四。";
        System.out.println(count(str2, "四"));
        System.out.println(count(str2, "十"));
        System.out.println(count(str2, "十四"));
        System.out.println(count(str2, "四十"));

    }

    public static int count(String str, String target) {
        //非空判断
        if (str == null || str.isEmpty() || target == null || target.length() == 0) return 0;

        int count = 0;
        while (str.indexOf(target) != -1) {
            count++;
            str = str.substring(str.indexOf(target) + target.length()+1);
        }
        return count;
    }
}
