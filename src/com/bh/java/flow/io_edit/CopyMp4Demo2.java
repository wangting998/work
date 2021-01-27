package com.bh.java.flow.io_edit;

import java.io.*;

/**
 * 需求：把d:\\demo\\xxx.mp4复制到当前项目目录下的copy.mp4中
 * <p>
 * 字节流四种方式复制文件：
 * 基本字节流一次读写一个字节：	共耗时：   毫秒
 * 基本字节流一次读写一个字节数组： 共耗时：毫秒
 * 高效字节流一次读写一个字节： 共耗时：毫秒
 * 高效字节流一次读写一个字节数组： 共耗时：毫秒
 */
public class CopyMp4Demo2 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //method1("d:\\demo\\最新标准版团歌.mp4","D:\\a.txt\\copy1.mp4"); //共耗时：19251毫秒
        //method2("d:\\demo\\最新标准版团歌.mp4","D:\\a.txt\\copy2.mp4");  //共耗时：32毫秒
        //method3("d:\\demo\\最新标准版团歌.mp4","D:\\a.txt\\copy3.mp4"); //共耗时：155毫秒
        method4("d:\\demo\\最新标准版团歌.mp4", "D:\\a.txt\\copy4.mp4"); //共耗时：1369毫秒
        long end = System.currentTimeMillis();
        System.out.println("共耗时：" + (end - start) + "毫秒");
    }

    //高效字节流一次读写一个字节数组：
    private static void method4(String srcString, String destString) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(srcString));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(destString));

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read()) != -1) {
            bos.write(bytes, 0, len);
        }

        bos.close();
        bis.close();
    }


    // 高效字节流一次读写一个字节：
    private static void method3(String srcString, String destString) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(srcString));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream(destString));

        int by = 0;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }
    }

    // 基本字节流一次读写一个字节数组
    public static void method2(String srcString, String destString)
            throws IOException {
        FileInputStream fis = new FileInputStream(srcString);
        FileOutputStream fos = new FileOutputStream(destString);

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }

        fos.close();
        fis.close();
    }

    // 基本字节流一次读写一个字节
    public static void method1(String srcString, String destString)
            throws IOException {
        FileInputStream fis = new FileInputStream(srcString);
        FileOutputStream fos = new FileOutputStream(destString);
        int by = 0;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fos.close();
        fis.close();
    }
}
