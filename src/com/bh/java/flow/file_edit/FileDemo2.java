package com.bh.java.flow.file_edit;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * 删除功能:public boolean delete()
 * <p>
 * 注意：
 * A:如果创建文件或者文件夹无路径，默认是项目路径
 * B:Java中的删除不经过回收站。
 * C:要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
 */
public class FileDemo2 {
    @Test
    public void deleteTest() throws IOException {
        // 创建文件
        File file = new File("d:\\a.txt");
        System.out.println("createNewFile:" + file.createNewFile()); //true

        // 删除功能：要删除a.txt文件
        File file3 = new File("d:\\a.txt");
        System.out.println("delete:" + file3.delete()); //true

        // 删除功能：要删除a.txt文件夹
        File file4 = new File("d:\\demo\\a.txt");
        System.out.println("delete:" + file4.delete()); //true

        // 删除功能：要删除aaa文件夹
        File file5 = new File("d:\\test\\aaa");
        System.out.println("delete:" + file5.delete()); //true
    }
}
