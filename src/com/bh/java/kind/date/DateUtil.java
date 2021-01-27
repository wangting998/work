package com.bh.java.kind.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期和字符串相互转换的工具类
 */
public class DateUtil {
    private DateUtil() {
    }

    /**
     * 方法的作用就是把日期转成一个字符串
     *
     * @param d      被转换的日期对象
     * @param format 传递过来的要被转换的格式
     * @return 格式化后的字符串
     */
    public static String dateToString(Date d, String format) {
        //SimpleDateFormat sdf = new SimpleDateFormat(format);
        //return sdf.format(d);
        return new SimpleDateFormat(format).format(d);
    }

    /**
     * 方法的作用就是把一个字符串解析成一个日期对象
     *
     * @param s      被解析的字符串
     * @param format 传递过来的要被转换的格式
     * @return 解析后的日期对象
     * @throws ParseException
     */
    public static Date stringToDate(String s, String format) throws ParseException {
        return new SimpleDateFormat(format).parse(s);
    }

    public static void main(String[] args) throws ParseException {
        // 把日期转换为字符串
        // 创建日期对象
        Date date = new Date();
        // 输出当前时间
        String string = DateUtil.dateToString(date, "yyyy/MM/dd HH:mm:ss");
        System.out.println("当前时间是:" + string); //当前时间是:2021/01/13 14:00:17

        // 把字符串转换为日期
        Date d = DateUtil.stringToDate("2012-12-12 12:12:12",
                "yyyy-MM-dd HH:mm:s");
        System.out.println(d); //Wed Dec 12 12:12:12 GMT+08:00 2012
    }
}
