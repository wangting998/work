package com.bh.java.flow.io_edit;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 实现换行
 * windows:\r\n
 * linux:\n
 * Mac:\r
 * 有些常见的个高级记事本，是可以识别任意换行符号的。
 * <p>
 * 如何实现数据的追加写入
 * 用构造方法带第二个参数是true的情况即可
 */
public class FileOutputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        //FileOutputStream fos = new FileOutputStream("fos3.txt");
        //创建一个向具有指定 name 的文件中写入数据的输出文件流。
        //如果第二个参数为 true，则将字节写入文件末尾处，而不是写入文件开始处。
        FileOutputStream fos = new FileOutputStream("fos3.txt", true);
        //写数据
        for (int x = 0; x < 10; x++) {
            fos.write(("hello" + x).getBytes());  //getBytes(),返回一个字节数组
            fos.write("\r\n".getBytes());
        }
        //释放资源
        fos.close();
    }
}
