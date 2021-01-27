package com.bh.java.exception_edit;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 有时是可以对异常进行处理的，但是又有些时候，根本就没有权限去处理某个异常。
 * 为了解决出错问题，Java针对这种情况，就提供了另一种处理方案：抛出
 * 格式：
 * throws 异常类名
 * 注意：这个格式必须跟着方法的括号后
 * 注意：
 * 开发过程中尽量不要再main方法中抛出异常
 */
public class ExceptionDemo3 {
    @Test
    public void exceptionTest4() {
        System.out.println("今天天气很好");
        try {
            method1();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("但是不该有雾霾");

        method2();
    }

    // 运行期异常的抛出
    private static void method2() throws ArithmeticException {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    // 编译期异常的抛出
    // 在方法声明上抛出，是为了告诉调用者，此处有问题。
    private static void method1() throws ParseException {
        String s = "2021-01-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ss HH:mm:ss");
        Date date = sdf.parse(s); //会出现异常，可throws ParseException
        System.out.println(date);
    }
}
