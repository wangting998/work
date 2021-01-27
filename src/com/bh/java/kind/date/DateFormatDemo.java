package com.bh.java.kind.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date	 --	 String(格式化)
 * public final String format(Date date)
 * <p>
 * String -- Date(解析)
 * public Date parse(String source)
 * <p>
 * DateForamt:可以进行日期和字符串的格式化和解析，
 * 但是由于是抽象类，所以使用具体子类SimpleDateFormat。
 * <p>
 * SimpleDateFormat的构造方法：
 * SimpleDateFormat():默认模式
 * SimpleDateFormat(String pattern):给定的模式
 * 这个模式字符串该如何写呢?
 * 通过查看API，我们就找到了对应的模式
 * 年 y
 * 月 M
 * 日 d
 * 时 H
 * 分 m
 * 秒 s
 * 2019年12月12日 12:12:12
 */
public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
        // Date -- String(格式化)
        // 创建日期对象
        Date date = new Date();
        //指定格式化模式   //SimpleDateFormat   是一个实体类
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        //public final String format(Date date)
        String s = sdf.format(date);
        System.out.println(s); //2021年01月13日 13:43:37

        //String -- Date
        String string = "2008-08-08 12:12:12";
        //在把一个字符串解析为日期的时候，请注意格式必须和给定的字符串格式匹配
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //public Date parse(String source)
        Date date2 = sdf2.parse(string);
        System.out.println(date2);  //Fri Aug 08 12:12:12 GMT+08:00 2008
    }
}
