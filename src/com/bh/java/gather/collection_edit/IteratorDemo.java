package com.bh.java.gather.collection_edit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator iterator():迭代器，集合的专用遍历方式
 * Object next():获取元素,并移动到下一个位置。
 * NoSuchElementException：没有这样的元素，因为你已经找到最后了。
 * boolean hasNext():如果仍有元素可以迭代，则返回 true。（
 */
public class IteratorDemo {
    @Test
    public void CollectionTest5() {
        // 创建集合对象
        Collection c = new ArrayList();
        //创建并添加元素
        //String s = "hello";
        //c.add(s);
        c.add("hello");
        c.add("world");
        c.add("java");

        // Iterator iterator():迭代器，集合的专用遍历方式
        Iterator iterator = c.iterator();

        // 最终版代码
        while (iterator.hasNext()) {
            //System.out.println(iterator.next()); //hello,world,java
            String s = (String) iterator.next();
            System.out.println(s); //hello,world,java
        }
    }
}
