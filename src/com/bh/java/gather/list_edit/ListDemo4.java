package com.bh.java.gather.list_edit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合特有功能：
 * A:添加功能
 * void add(int index,Object element):在指定位置添加元素
 * B:获取功能
 * Object get(int index):获取指定位置的元素
 * C:列表迭代器
 * ListIterator listIterator()：List集合特有的迭代器
 * D:删除功能
 * Object remove(int index)：根据索引删除元素,返回被删除的元素
 * E:修改功能
 * Object set(int index,Object element):根据索引修改元素，返回被修饰的元素
 */
public class ListDemo4 {
    @Test
    public void listTest4() {
        //创建集合对象
        List list = new ArrayList();
        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        // void add(int index,Object element):在指定位置添加元素
        //list.add(1,"android"); //list:[hello, android, world, java]
        //list.add(11, "javaee"); //有问题 IndexOutOfBoundsException
        //list.add(3,"javaee"); //没有问题 list:[hello, world, java, javaee]
        //list.add(4, "javaee"); //有问题 IndexOutOfBoundsException

        // Object get(int index):获取指定位置的元素
        //System.out.println("get:" + list.get(1)); //world
        //System.out.println("get:" + list.get(11));  //IndexOutOfBoundsException

        // Object remove(int index)：根据索引删除元素,返回被删除的元素
        //System.out.println("remove:" + list.remove(1)); //remove:world  list:[hello, java]
        //System.out.println("remove:" + list.remove(11)); //IndexOutOfBoundsException

        // Object set(int index,Object element):根据索引修改元素，返回被修饰的元素
        System.out.println("set:" + list.set(1, "javaee")); //set:world  list:[hello, javaee, java]
        System.out.println("list:" + list);
    }
}
