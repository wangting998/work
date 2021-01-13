package com.hb.kind.string;

public class SpringDemo1 {
    public static void main(String[] args) {
        /**
         * 字符串的特点：一旦被赋值，就不能改变。
         */
        String s = "hello";
        s += "world";
        System.out.println("s:" + s);  //helloworld
    }
}
