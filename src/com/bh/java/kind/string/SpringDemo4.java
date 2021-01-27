package com.bh.java.kind.string;

public class SpringDemo4 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        System.out.println(s3 == s1 + s2);// false
        System.out.println(s3.equals((s1 + s2)));// true

        System.out.println(s3 == "hello" + "world");// false (true)
        System.out.println(s3.equals("hello" + "world"));// true

        // 通过反编译看源码知道这里已经做好了处理。
        // System.out.println(s3 == "helloworld");
        // System.out.println(s3.equals("helloworld"));
    }
}

