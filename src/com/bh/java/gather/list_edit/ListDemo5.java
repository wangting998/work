package com.bh.java.gather.list_edit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合的特有遍历功能：
 * size()，get()方法结合使用
 */
public class ListDemo5 {
    @Test
    public void listTest5() {
        // 创建集合对象
        List list = new ArrayList();
        // 添加元素
        list.add("hello");
        list.add("world");
        list.add("java");
        // Object get(int index):获取指定位置的元素
        //System.out.println(list.get(0)); //hello
        //System.out.println(list.get(1)); //world
        //System.out.println(list.get(2)); //java
        //System.out.println(list.get(3)); //IndexOutOfBoundsException

        // 用循环改进
        /*for (int x = 0; x < 3; x++) {
            System.out.println(list.get(x)); //hello,world,java
        }*/
        // 如果元素过多，数起来就比较麻烦，所以我们使用集合的一个长度功能：size()
        // 最终的遍历方式就是：size()和get()
        for (int x = 0; x < list.size(); x++) {
            //System.out.println(list.get(x)); //hello,world,java
            String s = (String) list.get(x);
            System.out.println(s); //hello,world,java
        }
    }
}
