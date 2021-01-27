package com.bh.java.flow.io_edit;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 有一个缓冲区还是较为专业
 * 类被称为：缓冲区类(高效类)
 * 写数据：BufferedOutputStream
 * 读数据：BufferedInputStream
 * <p>
 * 构造方法可以指定缓冲区的大小，因为默认缓冲区大小就足够
 * <p>
 * 为什么不传递一个具体的文件或者文件路径，而是传递一个OutputStream对象
 * 原因是字节缓冲区流仅仅提供缓冲区，为高效而设计。但是真正的读写操作还得靠基本的流对象实现。
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        // BufferedOutputStream(OutputStream out)
        //FileOutputStream fos = new FileOutputStream("bos.txt");
        //BufferedOutputStream bos = new BufferedOutputStream(fos);

        //简单写法
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("bos.txt"));
        //写数据
        bos.write("hello".getBytes());
        //释放资源
        bos.close();
    }
}
