package com.bh.java.flow.io_edit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制文本文件。
 * 数据源：
 * a.txt	--	读取数据	--	FileInputStream
 * 目的地：
 * b.txt	--	写数据		--	FileOutputStream
 * java.io.FileNotFoundException: a.txt (系统找不到指定的文件。)
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        // 封装数据源
        FileInputStream fis = new FileInputStream("a.txt");
        //封装目的地
        FileOutputStream fos = new FileOutputStream("b.txt");

        //复制数据
        int by = 0;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        // 释放资源(无顺序)
        fos.close();
        fis.close();
    }
}
