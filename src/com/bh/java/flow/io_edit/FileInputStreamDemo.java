package com.bh.java.flow.io_edit;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 字节输入流操作步骤：
 * A:创建字节输入流对象
 * B:调用read()方法读取数据，并把数据显示在控制台
 * C:释放资源
 * <p>
 * 读取数据的方式：
 * A:int read():一次读取一个字节
 * B:int read(byte[] b):一次读取一个字节数组
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        // FileInputStream(String name)
        //FileInputStream fis = new FileInputStream("fOs.txt");
        FileInputStream fis = new FileInputStream("E:\\idea\\workspase\\login\\src\\com\\hb\\flow\\IO_edit\\FileOutputStreamDemo.java");

        int by = 0;
        //读取，赋值，判断
        while ((by = fis.read()) != -1) {
            System.out.println((char) by);
        }

        //释放资源
        fis.close();
    }
}
