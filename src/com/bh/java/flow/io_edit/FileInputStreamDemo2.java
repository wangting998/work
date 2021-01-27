package com.bh.java.flow.io_edit;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 创建字节输入流对象
        //FileInputStream fis = new FileInputStream("fos2.txt");
        FileInputStream fis = new FileInputStream("E:\\idea\\workspase\\login\\src\\com\\hb\\flow\\IO_edit\\FileOutputStreamDemo2.java");

        // 最终版代码
        // 数组的长度一般是1024或者1024的整数倍
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        //释放资源
        fis.close();
    }
}
