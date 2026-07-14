package com.itheima.test;

/**
 * 调整字符串
 * 给定两个字符串，A和B。
 * A的旋转操作就是将A最左边的字符移动到最右边。
 * 例如，若A='abcde'，在移动一次之后结果就是'bcdea'。
 * 如果不能匹配成功，则返回false
 * 如果在若干次调整操作之后，A能变成B，那么返回True。
 */
public class Test2 {
    static void main(String[] args) {
        String A = "abcde";
        String B = "cdeab";
        String C = "abcdf";

        System.out.println(ifEqualAfterRotate(A, B));//true
        System.out.println(ifEqualAfterRotate(B, C));//false


    }

    public static String rotate(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        sb.append(str.charAt(0));

        return sb.toString();
    }

    public static boolean ifEqualAfterRotate(String A, String B) {
        if (A == null || A.isEmpty() || B == null || B.isEmpty()) {
            System.out.println("A或B为空");
            return false;
        }
        if (A.length() != B.length()) {
            return false;
        }

        //外层循环用于遍历A移动的所有结果和B进行比较
        for (int i = 0; i < A.length(); i++) {
            //count用于记录A和B的每个字符是否相等的次数
            int count = 0;
            //内层循环用于比较A和B的每个字符是否相等
            for (int j = 0; j < B.length(); j++) {
                if (A.charAt(j) != B.charAt(j)) {
                    //如果A和B的字符不相等，重置count为0
                    count = 0;
                    break;
                }
                count++;
            }
            //如果count等于A的长度，说明A和B的所有字符都相等
            if (count == A.length()) {
                return true;
            }
            //如果count不等于A的长度，说明A和B的字符不相等，移动A一次后继续比较
            A = rotate(A);
        }
        return false;

    }
}
