package com.bh.java.exception_edit;

import org.junit.Test;

/**
 * 2021/1/14
 * 异常
 * 程序的异常：Throwable
 * 严重问题： Error 不处理。这种问题一般都是很严重的，比如说内存溢出。
 * 问题：Exception
 * 编译期问题：不是RuntimeException的异常 必须进行处理的，因为不处理，编译不能通过。
 * 运行期问题：RumtimeException 这种问题也不处理，因为是开发者的问题，
 * 而且这个问题肯定是代码不够严谨，需要修正代码。
 * 程序出现问题，没有做任何处理，最终jvm会做出默认的处理。
 * 把异常的名称，原因及出现的问题等信息输出在控制台。
 * 同时会出现程序
 */
public class ExceptionDemo1 {
    @Test
    public void exceptionTest1() {
        //第一阶段
        int a = 10;
        //int b = 2; //5
        int b = 0;
        System.out.println(a / b);  //b=0时出现异常ArithmeticException
        //第二阶段
        System.out.println("over");
    }

    /**
     * `* 如何处理异常
     * A:try...
     * catch...
     * finally
     * B:throws 抛出
     * <p>
     * try...catch...finally的处理格式：
     * try {
     * 可能出现问题的代码;
     * }catch(异常名 变量) {
     * 针对问题的处理;
     * }finally {
     * 释放资源; * 		}
     * <p>
     * 变形格式：
     * try {
     * 可能出现问题的代码;
     * }catch(异常名 变量) {
     * 针对问题的处理;
     * }
     * <p>
     * 注意：
     * A:try体内代码越少越好
     * B:catch内必须有内容，比如给出一个简单的提示也可
     */
    @Test
    public void exceptionTest2() {
        //第一阶段
        int a = 10;
        //int b = 2; //5
        int b = 0;
        //b=0时出现异常ArithmeticException,所以需要解决异常
        try {
            System.out.println(a / b);  //b=0时出现异常ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }
        //第二阶段
        System.out.println("over");
    }
}
