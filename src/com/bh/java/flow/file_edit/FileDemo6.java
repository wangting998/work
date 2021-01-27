package com.bh.java.flow.file_edit;

import java.io.File;

/**
 * 获取功能：
 * public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
 * public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
 */
public class FileDemo6 {
    public static void main(String[] args) {
        // 指定一个目录
        File file = new File("D:\\");

        // public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
        String[] strArry = file.list();
        for (String s : strArry) {
            System.out.println(s);
        }
        System.out.println("------------");
        // public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
        File[] fileArray = file.listFiles();
        for (File f : fileArray) {
            System.out.println(f.getName());
        }
    }
}
