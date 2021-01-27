package com.bh.java.flow.file_edit;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * 重命名功能:public boolean renameTo(File dest)
 * 如果路径名相同，就是改名。
 * 如果路径名不同，就是改名并剪切。
 * <p>
 * 路径以盘符开始：绝对路径	c:\\a.txt
 * 路径不以盘符开始：相对路径	a.txt
 */
public class FileDemo3 {
    @Test
    public void renameToTest() throws IOException {
        //创建文件d:\\test
        File file = new File("D:\\test");
        System.out.println("mkdir:" + file.mkdir());
        //创建文件d:\\text
        File file1 = new File("D:\\text");
        System.out.println("mkdir:" + file1.mkdir());

        //重命名功能:public boolean renameTo(File dest)
        //重新命名此抽象路径名表示的文件。
        // 如果路径名一致的情况,那么只是重命名,
        // 如果两次路径名称不一致,那么不只是重命名,并且剪切
        System.out.println(file.renameTo(file1)); //false
    }
}
