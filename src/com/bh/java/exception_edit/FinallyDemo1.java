package com.bh.java.exception_edit;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FinallyDemo1 {
    @Test
    public void Finallytest1() {
        String s = "2014-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date d = null;
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            System.exit(0);
        } finally {
            System.out.println("这里的代码是执行的。。。");
        }
        System.out.println(d);
    }
}
