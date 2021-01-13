package com.hb.kind.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算你来到这个世界多少天?
 * 分析：
 * 		A:键盘录入你的出生的年月日
 * 		B:把该字符串转换为一个日期
 * 		C:通过该日期得到一个毫秒值
 * 		D:获取当前时间的毫秒值
 * 		E:用D-C得到一个毫秒值
 * 		F:把E的毫秒值转换为年
 * 			/1000/60/60/24
 */
public class MyYearOldDemo {

    public static void main(String[] args) throws ParseException {
        //键盘录入你的出生的年月日
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的出生年月日:");
        String Line = scanner.nextLine();

        //把该字符串转换为一个日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(Line);

        //通过该日期得到一个毫秒值
        long myTime = d.getTime();
        System.out.println(myTime);

        //获取当前时间的毫秒值
        long nowTime = System.currentTimeMillis();
        System.out.println(nowTime);

        //用当前时间的毫秒值-该日期得到一个毫秒值得到一个毫秒值
        long time = nowTime - myTime;
        System.out.println(time);

        //把E的毫秒值转换为年
        long year = time /1000/60/60/24/365;
        System.out.println("你来到这个世界上一共" + year + "年了");
        //把毫秒值转换为天数 /1000/60/60/24
        long day = time /1000/60/60/24;
        System.out.println("你来到这个世界上一共" + day + "天了");
    }
}
