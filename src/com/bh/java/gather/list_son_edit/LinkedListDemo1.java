package com.bh.java.gather.list_son_edit;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * LinkedList的特有功能：
 * A:添加功能
 * public void addFirst(Object e)
 * public void addLast(Object e)
 * B:获取功能
 * public Object getFirst()
 * public Obejct getLast()
 * C:删除功能
 * public Object removeFirst()
 * public Object removeLast()
 */
public class LinkedListDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        LinkedList linkedList = new LinkedList();
        //添加功能
        //public void addFirst(Object e)
        //public void addLast(Object e)
        linkedList.addFirst("hello");
        linkedList.addFirst("world");
        linkedList.addLast("java");

        //获取功能
        //public Object getFirst()
        //public Obejct getLast()
        //System.out.println(linkedList.getFirst()); //world
        //System.out.println(linkedList.getLast()); //java

        //删除功能
        //public Object removeFirst()
        //public Object removeLast()
        //System.out.println(linkedList.removeFirst()); //world
        System.out.println(linkedList.removeLast()); //java

        //遍历
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
