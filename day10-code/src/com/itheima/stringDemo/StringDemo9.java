package com.itheima.stringDemo;

/**
 * 数字转成中文，一共有7位，例如1234567，转成中文为壹佰贰拾叁万肆仟伍佰陆拾柒元
 * 如果位数不够，则用零补全，比如123456，转成中文为壹拾贰万叁仟肆佰伍拾陆元
 */
public class StringDemo9 {
    public static void main(String[] args) {
//        int num=1234567;
//        if(num<0||num>9999999){
//            System.out.println("输入错误");
//            return;
//        }
        System.out.println(numToChinese(1234567));
        System.out.println(numToChinese(123456));
        System.out.println(numToChinese(1234));
    }
    public static String numToChinese(int num){
        String result="";
        String chineseStr="";
        //将数字转为字符串
        String numStr=num+"";
        //用0补全到7位
        while(numStr.length()<7){
            numStr="0"+numStr;
        }
        //将数字字符串转换为中文数字
        for(int i=0;i<7;i++){
            chineseStr+=findChineseNum(numStr.charAt(i));
        }

        //将中文数字转换为中文金额格式
        result=chineseStr.charAt(0)+"佰"+chineseStr.charAt(1)+"拾"+chineseStr.charAt(2)+"万"+chineseStr.charAt(3)+"仟"+chineseStr.charAt(4)+"佰"+chineseStr.charAt(5)+"拾"+chineseStr.charAt(6)+"元";

//        char[] chs = {'佰','拾','万','仟','佰','拾','元'};
//        for(int i=0;i<chs.length;i++){
//            result+=chineseStr.charAt(i);
//            result+=chs[i];
//        }

        return  result;
    }

    public static String findChineseNum(char num){
        String result = switch (num) {
            case '0' -> "零";
            case '1' -> "壹";
            case '2' -> "贰";
            case '3' -> "叁";
            case '4' -> "肆";
            case '5' -> "伍";
            case '6' -> "陆";
            case '7' -> "柒";
            case '8' -> "捌";
            case '9' -> "玖";
            default -> "";
        };
        return result;
    }

//    public static char toUpperNum(char num){
//        char[] chs = {'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
//        return chs[num-'0'];
//    }


}
