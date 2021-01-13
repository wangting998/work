package com.hb.kind.Calendar_edit;

import java.util.Calendar;

/**
 * public void add(int field,int amount):
    根据给定的日历字段和对应的时间，来对当前的日历进行操作。
 * public final void set(int year,int month,int date):
    设置当前日历的年月日
 */
public class CalendarDemo1 {
    public static void main(String[] args){
        // 获取当前的日历时间
        Calendar calendar = Calendar.getInstance();

        //获取年
        int year = calendar.get(Calendar.YEAR);
        // 获取月
        int month = calendar.get(Calendar.MONTH);
        // 获取日
        int date = calendar.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");

        /**public void add(int field,int amount):
        根据给定的日历字段和对应的时间，来对当前的日历进行操作。*/
        //三年前的今天
        /*calendar.add(Calendar.YEAR,-3);
        // 获取年
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        date = calendar.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");*/

        // 5年后的10天
        calendar.add(Calendar.YEAR,-5);
        calendar.add(Calendar.DATE,-10);
        // 获取年
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        date = calendar.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");
        System.out.println("-----------------");

        /**public final void set(int year,int month,int date):
              设置当前日历的年月日*/
        calendar.set(2019,11,11);
        // 获取年
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        date = calendar.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");  //2019年12月11日
    }
}
