package com.bh.java.gather.map_edit;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * HashMap
 * 常用的方法:
 * 添加：
 * public V put(K key, V value)  添加键值对
 * 将指定的值与此映射中的指定键关联,如果映射以前包含一个键的映射，旧值将被替换。
 * public void putAll(Map<? extends K,? extends V> m) 将所有键/值对添加到映射中
 * 从指定的映射到该Map的所有映射。这些映射将取代当前在指定Map中的任何键的任何映射。
 * 获取：
 * get(Object key) 获取指定 key 对应对 value
 * 返回指定的键映射的值，或 null如果这个Map不包含的键映射。
 * public int size() 返回这个映射（hashMap）中的键值映射的数目。
 * 删除：
 * public V remove(Object key)
 * 如果存在，则从该Map中移除一个键的映射。
 * public void clear()
 * 从这个映射中移除所有的映射。这个调用返回后的Map将是空的。
 * 判断：
 * public boolean isEmpty()  判断 hashMap 是否为空
 * <p>
 * 替换：
 * public V replace(K key,V value) 替换 hashMap 中是指定的 key 对应的 value。
 * 拷贝：
 * public Object clone() 返回该 HashMap实例浅拷贝：键和值本身不是克隆。
 * <p>
 * 由于Map中存放的元素均为键值对，故每一个键值对必然存在一个映射关系。
 * Map中采用Entry内部类来表示一个映射项，映射项包含Key和Value
 * 通过Map.entrySet使用iterator遍历key和value：
 * 可使用它对map进行遍历。
 */
public class HashMapDemo1 {
    @Test
    public void getTest() {
        //创建HashMap对象
        HashMap<Integer, String> hashMap = new HashMap<>();
        //添加键值对 public V put(K key, V value)
        hashMap.put(1, "Google");
        hashMap.put(2, "Runoob");
        hashMap.put(3, "Taobao");
        System.out.println("hashMap: " + hashMap); //hashMap: {1=Google, 2=Runoob, 3=Taobao}

        //putAll() 方法将指定所有的键/值对插入到 HashMap 中。
        //HashMap<Integer, String> hashMap2 = new HashMap<>();
        //hashMap2.put(4, "Wiki");
        // 将所有的映射关系从 sites 添加到 sites2
        //hashMap2.putAll(hashMap);
        //System.out.println(hashMap2);

        //get(Object key) 得到value
        //String value = hashMap.get(1);
        //System.out.println("key 1 对应的 value: " + value); //key 1 对应的 value: Google

        //public int size() 返回这个映射中的键值映射的数目。
        //int size = hashMap.size();
        //System.out.println("Map集合的大小为:"+size); //Map集合的大小为:3

        //删除key为2的映射关系
        // public V remove(Object key) 移除一个键的映射。
        //String name = hashMap.remove(2);

        //public void clear() 从这个映射中移除所有的映射。这个调用返回后的Map将是空的。
        //hashMap.clear();
        //System.out.println("使用 clear() 方法后: " + hashMap);

        //返回 true如果这个Map不包含键值的映射。public boolean isEmpty()
        //boolean result = hashMap.isEmpty();
        //System.out.println(result);   //false

        //public V replace(K key,V value)
        // 替换 hashMap 中是指定的 key 对应的 value。
        //String value = hashMap.replace(1,"Wiki");
        //System.out.println("替换之后: " + hashMap); //{1=Wiki, 2=Runoob, 3=Taobao}

        //public Object clone() ,复制一份 hashMap，属于浅拷贝。
        HashMap clone = (HashMap) hashMap.clone();
        System.out.println("clone" + clone);

        Iterator<Map.Entry<Integer, String>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("key: " + entry.getKey() + "; value: " + entry.getValue());
        }
    }
}
