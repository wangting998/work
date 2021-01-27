package com.bh.java.gather.list_edit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 需求：
 * List集合存储字符串并遍历。
 */
public class ListDemo1 {
    @Test
    public void listTest1() {
        //创建集合对象
        List list = new ArrayList();
        //创建字符串并添加字符串
        list.add("hello");
        list.add("world");
        list.add("java");
        //遍历集合
        // Iterator iterator():迭代器，集合的专用遍历方式
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            System.out.println(s);
        }
    }
}
