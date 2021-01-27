package com.bh.java.flow.io_edit;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO流分类：
 * 流向：
 * 输入流	读取数据
 * 输出流 写出数据
 * 数据类型：
 * 字节流
 * 字节输入流	读取数据	InputStream
 * 字节输出流	写出数据	OutputStream
 * 字符流
 * 字符输入流	读取数据	Reader
 * 字符输出流	写出数据	Writer
 * 注意：默认情况下是按照数据类型分
 * 需求：要向文本文件中输入："hello,io"
 * <p>
 * 使用：OutputStream
 * 流对象是一个抽象类，不能实例化
 * 所以，要一个具体的子类。
 * 而要找的子类名称：
 * 文件：File
 * 然后用的是字节输出流：FileOutputStream
 * 注意：基类的子类都是以父类名作为后缀名。
 * XxxOutputStream
 * XxxInputStream
 * XxxReader
 * XxxWriter
 * FileOutputStream的构造方法：
 * FileOutputStream(File file)
 * FileOutputStream(String name)
 * <p>
 * 字节输出流操作步骤：
 * A:创建字节输出流对象
 * B:写数据
 * C:释放资源
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        //FileOutputStream(File file)
        //File file = new File("fos.txt");
        //FileOutputStream fos = new FileOutputStream(file);
        // FileOutputStream(String name)
        FileOutputStream fos = new FileOutputStream("fos.txt");

        //写数据
        fos.write("hello,IO".getBytes());
        fos.write("java".getBytes());   //getBytes(),返回一个字节数组

        //释放资源
        //关闭此文件输出流并释放与此流有关的所有系统资源
        fos.close();
        /**
         * 一定要close()
         * A:流对象变成垃圾，就可以被垃圾回收器回收
         * B:通知系统去释放跟该文件相关的资源
         */
    }
}
