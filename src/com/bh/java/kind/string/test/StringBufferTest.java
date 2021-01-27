package com.bh.java.kind.string.test;

/**
 * 类之间的转换：
 * A -- B的转换
 * 把A转换为B，其实是为了使用B的功能。
 * B -- A的转换
 * 可能要的结果是A类型，所以还得转回来。
 * <p>
 * String与StringBuffer的相互
 */
public class StringBufferTest {
    public static void main(String[] args) {
        /** String -- StringBuffer*/
        String s = "hello";
        // 注意：不能把字符串的值直接赋值给StringBuffer
        // 方式1:通过构造方法
        StringBuffer sb = new StringBuffer(s);
        // 方式2：通过append()方法
        StringBuffer sb2 = new StringBuffer();
        sb2.append(s);

        System.out.println("sb:" + sb); //sb:hello
        System.out.println("sb2:" + sb2); //sb2:hello
        System.out.println("---------------");

        /** StringBuffer -- String*/
        StringBuffer buffer = new StringBuffer("java");
        // 方式1:通过构造方法
        String str = new String(buffer);
        // 方式2：通过toString()方法
        String str2 = buffer.toString();
        System.out.println("str:" + str); //str:java
        System.out.println("str2:" + str2); //str2:java
    }
}
