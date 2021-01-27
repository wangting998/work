package com.bh.java.flow.io_edit;

import java.io.*;

/**
 * 需求：把当前项目目录下的a.txt内容复制到当前项目目录下的b.txt中
 * <p>
 * 数据源：
 * a.txt -- 读取数据 -- 字符转换流 -- InputStreamReader
 * 目的地：
 * b.txt -- 写出数据 -- 字符转换流 -- OutputStreamWriter
 */
public class CopyFileDemo3 {
    public static void main(String[] args) throws IOException, IOException {
        //封装数据源
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("d:\\demo\\a.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("d:\\demo\\b.txt"));

        //复制数据
        int by = 0;
        while ((by = isr.read()) != -1) {
            osw.write(by);
        }
        // 释放资源
        osw.close();
        osw.close();
    }
}
