package com.bh.java.gather.list_edit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List集合的特点：
 * 有序集合（也被称为序列）。
 * List集合中的素允许重复，各元素的顺序放是对象插入的顺序，类似Java中的数组，用户可通过使用索引(元素在集合中的位置)来访问集合中的元素。
 * 此接口的用户在列表中的每个元素都被插入的地方有精确的控制。
 * 用户可以通过它们的整数索引（在列表中的位置）访问元素，并在列表中搜索元素。
 */
public class ListDemo2 {
    @Test
    public void listTest2() {
        // 创建集合对象
        List list = new ArrayList();

        // 创建字符串并添加字符串
        list.add("hello");
        list.add("hello");
        list.add("java");

        // void add(int index,Object element):在指定位置添加元素
        //list.add(1,"android"); //list:[hello, android, world, java]

        // Object get(int index):获取指定位置的元素
        System.out.println("get:" + list.get(1)); //hello

        //遍历集合
        // Iterator iterator():迭代器，集合的专用遍历方式
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            System.out.println(s);
        }
    }
}
