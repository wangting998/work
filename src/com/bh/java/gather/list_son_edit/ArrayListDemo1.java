package com.bh.java.gather.list_son_edit;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * List特点：
 * ArrayList:
 * 底层数据结构是数组，查询快，增删慢
 * 线程不安全，效率高
 * Vector:
 * 底层数据结构是数组，查询快，增删慢
 * 线程安全，效率低
 * LinkedList:
 * 底层数据结构是链表，查询慢，增删快
 * 线程不安全，效率高
 * 案例：
 * 使用List的任何子类存储字符串或者存储自定义对象并遍历。
 * ArrayList的使用。
 * 存储字符串并遍历
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList arrayList = new ArrayList();
        //创建元素对象，并添加
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");

        //迭代器遍历
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
