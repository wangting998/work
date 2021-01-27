package com.bh.java.flow.io_edit;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * InputStreamReader的方法：
 * int read():一次读取一个字符
 * int read(char[] chs):一次读取一个字符数组
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("bos.txt"));
        //int read():一次读取一个字符
        /*int ch = 0;
        while ((ch = isr.read()) != -1){
            System.out.print((char) ch);
        }*/

        //int read():一次读取一个字符
        char[] chars = new char[1024];
        int len = 0;
        while ((len = isr.read(chars)) != -1) {
            System.out.print(new String(chars, 0, len));
        }
        //释放资源
        isr.close();
    }
}
