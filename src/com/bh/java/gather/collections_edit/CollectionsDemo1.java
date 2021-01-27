package com.bh.java.gather.collections_edit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections:是针对集合进行操作的工具类，都是静态方法。
 * <p>
 * 面试题：
 * Collection和Collections的区别
 * Collection:是单列集合的顶层接口，有子接口List和Set。
 * Collections:是针对集合操作的工具类，有对集合进行排序和二分查找的方法
 * <p>
 * 方法
 * public static <T> void sort(List<T> list)：排序 默认情况下是自然顺序。
 * public static <T> int binarySearch(List<?> list,T key): 二分查找
 * public static <T> T max(Collection<?> coll):最大值
 * public static void reverse(List<?> list):反转
 * public static void shuffle(List<?> list):随机置换
 */
public class CollectionsDemo1 {
    @Test
    public void collectionsTest1() {
        //创建集合对象
        List<Integer> list = new ArrayList<Integer>();
        //添加元素
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);

        System.out.println("list:" + list); //[30, 20, 50, 10, 40]

        // public static <T> void sort(List<T> list)：排序 默认情况下是自然顺序。
        //Collections.sort(list);
        //System.out.println("list:" + list); //[10, 20, 30, 40, 50]

        //public static <T> int binarySearch(List<?> list,T key):二分查找
        //System.out.println("binarySearch:" + Collections.binarySearch(list,30)); //0
        //System.out.println("binarySearch:" + Collections.binarySearch(list,300)); //-6

        // public static <T> T max(Collection<?> coll):最大值
        //System.out.println("max:" + Collections.max(list)); //50

        // public static void reverse(List<?> list):反转
        //Collections.reverse(list);
        //System.out.println("list:" + list); //[40, 10, 50, 20, 30]

        //public static void shuffle(List<?> list):随机置换
        Collections.shuffle(list);
        System.out.println("list:" + list); //[10, 30, 40, 20, 50]
    }
}
