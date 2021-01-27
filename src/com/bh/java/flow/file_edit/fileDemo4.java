package com.bh.java.flow.file_edit;

import java.io.File;

/**
 * 判断功能:
 * public boolean isDirectory():判断是否是目录
 * public boolean isFile():判断是否是文件
 * public boolean exists():判断是否存在
 * public boolean canRead():判断是否可读
 * public boolean canWrite():判断是否可写
 * public boolean isHidden():判断是否隐藏
 */
public class fileDemo4 {
    public static void main(String[] args) {
        // 创建文件对象
        File file = new File("D:\\a.txt");
        System.out.println("mkdir:" + file.mkdir());

        //public boolean isDirectory():判断是否是目录
        System.out.println("isDirectory:" + file.isDirectory()); //true
        //public boolean isFile():判断是否是文件
        System.out.println("isFile:" + file.isFile()); //false
        //public boolean exists():判断是否存在
        System.out.println("exists:" + file.exists()); //true
        //public boolean canRead():判断是否可读
        System.out.println("canRead:" + file.canRead()); //true
        //public boolean canWrite():判断是否可写
        System.out.println("canWrite:" + file.canWrite()); //true
        //public boolean isHidden():判断是否隐藏
        System.out.println("isHidden:" + file.isHidden()); //false
    }
}
