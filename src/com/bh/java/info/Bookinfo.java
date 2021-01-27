package com.bh.java.info;

import org.junit.Test;

public class Bookinfo {
    @Test
    public void test() {
        //字节数组
        byte b[] = "山东大学软件学院".getBytes();
        System.out.println(b.length);    //24
    }

    @Test
    public <Char> void info() {
        String str = "山东大学";
        //对象调用方法str.split(",");  split() 方法用于把一个字符串分割成字符串数组。
        String[] array = str.split(",");   //java中连接运算符是+，.是成员运算符
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            System.out.println(ch);
        }
    }

    @Test
    public void bytetest() {
        String str = "山东济南";
        byte[] bytes = str.getBytes();
        System.out.print("[");
        for (int i = 0; i < bytes.length; i++) {
            if (i == bytes.length - 1) {
                System.out.print(bytes[i]);
                //continue;
            } else {
                System.out.print(bytes[i] + ",");
            }
        }
        System.out.print("]");
    }
}
