package com.bh.java.gather.collection_edit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean addAll(Collection c):添加一个集合的元素
 * boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有)
 * boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有)
 * boolean retainAll(Collection c):两个集合都有的元素?返回的boolean又是什么意思呢?
 */
public class CollectionDemo2 {
    @Test
    public void CollectionTest2() {
        //创建集合1
        Collection c1 = new ArrayList();
        c1.add("abcd1");
        c1.add("abcd2");
        c1.add("abcd3");
        c1.add("abcd4");

        //创建集合2
        Collection c2 = new ArrayList();
        /*c2.add("abcd1");
        c2.add("abcd2");
        c2.add("abcd3");
        c2.add("abcd4");*/
        c2.add("abcd5");
        c2.add("abcd6");
        c2.add("abcd7");

        //boolean addAll(Collection c):添加一个集合的元素
        //System.out.println("addAll:" + c1.addAll(c2)); //true

        //boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有)
        //System.out.println("removeAll:" + c1.removeAll(c2));

        //boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有)
        //只有包含所有的元素，才叫包含
        System.out.println("containsAll" + c1.containsAll(c2));
        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);
    }
}
