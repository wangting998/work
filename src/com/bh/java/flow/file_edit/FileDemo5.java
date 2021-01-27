package com.bh.java.flow.file_edit;

import java.io.File;
import java.io.IOException;

/**
 * 获取功能：
 * public String getAbsolutePath()：获取绝对路径
 * public String getPath():获取相对路径
 * public String getName():获取名称
 * public long length():获取长度。字节数
 * public long lastModified():获取最后一次的修改时间，毫秒值
 */
public class FileDemo5 {
    public static void main(String[] args) throws IOException {
        // 创建文件对象
        File file = new File("D:\\demo\\b.txt");
        System.out.println("createNewFile:" + file.createNewFile()); //true

        //public String getAbsolutePath()：获取绝对路径
        System.out.println("getAbsolutPath:" + file.getAbsolutePath()); //D:\demo\b.txt
        //public String getPath():获取相对路径
        System.out.println("getPath:" + file.getPath()); //D:\demo\b.txt
        //public String getName():获取名称
        System.out.println("getName:" + file.getName()); //b.txt
        //public long length():获取长度。字节数
        System.out.println("length:" + file.length()); //0
        //public long lastModified():获取最后一次的修改时间，毫秒值
        System.out.println("lastModified:" + file.lastModified()); //1610869864934
    }


}
