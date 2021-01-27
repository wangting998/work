package com.bh.java.kind.date;

import org.junit.Test;

import java.util.Date;

/**
 * 2021/1/13
 * Date:表示特定的瞬间，精确到毫秒。
 * 构造方法：
 * Date():根据当前的默认毫秒值创建日期对象
 * Date(long date)：根据给定的毫秒值创建日期对象
 */
public class DateDemo {
    public static void main(String[] args) {
        //创建对象
        //Date():根据当前的默认毫秒值创建日期对象
        Date date = new Date();
        System.out.println("date:" + date);

        //创建对像
        //Date(long date)：根据给定的毫秒值创建日期对象
        //long time = String.currentTimeMillis();
        long time = 1000 * 60 * 60; //1小时
        Date date2 = new Date(time);
        System.out.println("date2:" + date2); //date2:Thu Jan 01 09:00:00 GMT+08:00 1970
    }

    /**
     * public long getTime():获取时间，以毫秒为单位
     * public void setTime(long time):设置时间
     * <p>
     * 从Date得到一个毫秒值
     * getTime()
     * 把一个毫秒值转换为Date
     * 构造方法
     * setTime(long time)
     */
    @Test
    public void test() {
        //创建对象
        Date d = new Date();
        // 获取时间 public long getTime():获取时间，以毫秒为单位
        long time = d.getTime();
        System.out.println(time);
        //System.out.println(System.currentTimeMillis());
        System.out.println("d:" + d); //d:Wed Jan 13 13:31:47 GMT+08:00 2021

        // 设置时间 public void setTime(long time):设置时间
        d.setTime(1000);
        System.out.println("d:" + d); //d:Thu Jan 01 08:00:01 GMT+08:00 1970
    }
}
