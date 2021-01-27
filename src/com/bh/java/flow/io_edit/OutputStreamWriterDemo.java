package com.bh.java.flow.io_edit;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * OutputStreamWriter的方法：
 * public void write(int c):写一个字符
 * public void write(char[] cbuf):写一个字符数组
 * public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
 * public void write(String str):写一个字符串
 * public void write(String str,int off,int len):写一个字符串的一部分
 * <p>
 * 面试题：close()和flush()的区别?
 * A:close()关闭流对象，但是先刷新一次缓冲区。关闭之后，流对象不可以继续再使用了。
 * B:flush()仅仅刷新缓冲区,刷新之后，流对象还可以继续使用。
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException, IOException {
        //创建对象
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("osw2.txt"));
        // 写数据
        //public void write(int c):写一个字符
        //osw.write('a');
        //osw.write(97);

        //public void write(char[] cbuf):写一个字符数组
        //char[] chars = {'a','b','c','d','e'};
        //osw.write(chars);

        //public void write(String str):写一个字符串
        //osw.write("山东大学软件学院");
        //刷新缓冲区
        osw.flush();
        osw.write("山东大学软件学院", 2, 3);
        // 释放资源
        osw.close();
    }
}
