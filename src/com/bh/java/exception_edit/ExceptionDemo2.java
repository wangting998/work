package com.bh.java.exception_edit;

import org.junit.Test;

/**
 * A:一个异常
 * B:二个异常的处理
 * a:每一个写一个try...catch
 * b:写一个try，多个catch
 * try{
 * ...
 * }catch(异常类名 变量名){
 * ...
 * }catch(异常类名 变量名){
 * <p>
 * }
 * 注意：
 * 一旦try内出现问题，就会把问题给抛出去，然后与catch里面的处理方式进行匹配，
 * 一旦有匹配的，就会执行catch里面的处理，然后结束try...catch
 * 继续执行后面的语句。
 */
public class ExceptionDemo2 {
    @Test
    public void exceptionTest3() {
        //method1();
        //mothode2();
        //mothode3();
        mothode4();
    }

    /**
     * 再异常中。。。
     */
    private static void mothode4() {
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 3};
        try {
            System.out.println(a / b);
            System.out.println(arr[3]);
            System.out.println("这里出现了一个异常");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("访问了不该的访问的索引");
        } catch (Exception e) {
            System.out.println("出问题了");
        }
        System.out.println("over");
    }

    /**
     * 两个异常的处理
     */
    private static void mothode3() {
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 3};
        try {
            /**问题：只能解决一个异常，谁在前，先解决谁*/
            System.out.println(arr[3]);
            System.out.println(a / b);
            // System.out.println(arr[3]);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("访问了不该的访问的索引");
        }

        System.out.println("over");
    }

    /**
     * 两个异常
     */
    private static void mothode2() {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }

        int[] arr = {1, 2, 3};
        //若不抛出异常：ArrayIndexOutOfBoundsException
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("访问了不该访问的索引");
        }
        System.out.println("over");
    }

    /**
     * 一个异常
     */
    private static void method1() {
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
