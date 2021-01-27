package com.bh.java.flow.file_edit;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * 实现IO操作，须了解硬盘文件表现形式
 * Java就提供了一个类File
 * <p>
 * File:
 * 文件和目录(文件夹)路径名的抽象表示形式
 * 构造方法：
 * File(String pathname)：根据一个路径得到File对象
 * File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
 * File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
 * 三者效果一样
 * 1)  File file = new File("E:\\demo\\a.txt");
 * 2)  File file2 = new File("E:\\demo", "a.txt");
 * 3)  File file3 = new File("e:\\demo");
 * File file4 = new File(file3, "a.txt");
 * 创建功能：
 * public boolean createNewFile():创建文件 如果文件存在，则不创建
 * public boolean mkdir():创建文件夹 如果文件夹存在，则不创建
 * public boolean mkdirs():创建文件夹,如果父文件夹不存在，则一同创建
 */
public class FileDemo1 {
    @Test
    public void Test() {
        // File(String pathname)：根据一个路径得到File对象
        // 把e:\\demo\\a.txt封装成一个File对象
        File file = new File("D:\\demo\\a.txt");

        // File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
        File file2 = new File("E:\\demo", "a.txt");

        // File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
        File file3 = new File("e:\\demo");
        File file4 = new File(file3, "a.txt");

        // 三种方式效果一样
    }

    @Test
    public void addTest() throws IOException {
        // 需求：在e盘目录下创建一个文件夹demo
        File file = new File("D:\\demo");
        System.out.println("mkdir:" + file.mkdir());  //true

        // 需求:在e盘目录demo下创建一个文件a.txt
        File file2 = new File("D:\\demo\\a.txt");
        System.out.println("CreateNewFile:" + file2.createNewFile()); //true

        // 需求：在e盘目录test下创建一个文件b.txt
        //注意：要在某个目录下创建内容，该目录首先必须存在。
        //File file3 = new File("D:\\test\\b.txt");
        //System.out.println("CreateNewFile:" + file3.createNewFile());
        //Exception in thread "main" java.io.IOException: 系统找不到指定的路径。

        // 需求:在e盘目录test下创建aaa目录
        //File file4 = new File("D:\\test\\aaa");
        //System.out.println("mkdir:" + file4.mkdir());
        //Exception in thread "main" java.io.IOException: 系统找不到指定的路径。

        //File file5 = new File("D:\\test");
        //File file6 = new File("D:\\test\\aaa");
        //System.out.println("mkdir:" + file5.mkdir()); //true
        //System.out.println("mkdir:" + file6.mkdir()); //true

        // 更简单的方法
        //File file7 = new File("D:\\aaa\\bbb\\ccc\\ddd");
        //System.out.println("mkdir:" + file7.mkdir());  //falsse

        //
        //File file8 = new File("D:\\demo\\a.txt");
        //System.out.println("mkdirs:" + file8.mkdirs());

        File file9 = new File("D:\\demo\\b.txt");
        file9.createNewFile();
    }
}
