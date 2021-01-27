package com.bh.java.flow.io_edit;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节输出流操作步骤：
 * A:创建字节输出流对象
 * B:调用write()方法
 * C:释放资源
 * <p>
 * public void write(int b):写一个字节
 * public void write(byte[] b):写一个字节数组
 * public void write(byte[] b,int off,int len):写一个字节数组的一部分
 */
public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 创建字节输出流对象
        //OutputStream os = new FileOutputStream("fos2.txt"); //多态
        FileOutputStream fos = new FileOutputStream("fos2.txt");

        //调用write方法
        //public void write(int b):写一个字节
        //os.write(97);
        //fos.write(97);
        //fos.write(57);
        //fos.write(55);

        //public void write(byte[] b):写一个字节数组
        byte[] bytes = {97, 98, 99, 100, 101};
        fos.write(bytes);

        //public void write(byte[] b,int off,int len):写一个字节数组的一部分
        fos.write(bytes, 1, 3);

        //释放资源
        //os.close();
        fos.close();
    }
}
