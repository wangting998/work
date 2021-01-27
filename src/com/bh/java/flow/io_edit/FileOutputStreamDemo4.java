package com.bh.java.flow.io_edit;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 加入异常处理的字节输出流操作
 */
public class FileOutputStreamDemo4 {
    public static void main(String[] args) {
        //在finally里面能够看到该对象则必须定义到外面，
        //为了问不出问题，必须给初始化值
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("fos4.txt");
            fos.write("java".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //如果fos不为null，则需要colse()
            if (fos != null) {
                // 为保证close()一定会执行，就放到这里了
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
