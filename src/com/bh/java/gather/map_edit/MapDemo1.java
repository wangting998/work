package com.bh.java.gather.map_edit;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Interface Map<K,V>
 * K -钥匙的Map保持型
 * V -映射的值的类型
 * 将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。
 * map键值对，值一般存储的是对象。
 * 类： HashMap
 * 方法：
 * public V put(K key, V value) 将键/值对添加到 hashMap 中
 * 将指定的值与此映射中的指定键关联,如果映射以前包含一个键的映射，旧值将被替换。
 * <p>
 * 由于Map中存放的元素均为键值对，故每一个键值对必然存在一个映射关系。
 * Map中采用Entry内部类来表示一个映射项，映射项包含Key和Value
 * 通过Map.entrySet使用iterator遍历key和value：
 * 可使用它对map进行遍历。
 */
public class MapDemo1 {
    @Test
    public void putTest() {
        //创建HashMap对象
        HashMap hashMap = new HashMap();
        //添加键值对
        //put()方法 获取Map集合的所有键名、添加键值对(key-value)
        hashMap.put("1", "哈哈");
        hashMap.put("2", "嘻嘻");
        System.out.println("HashMap: " + hashMap);  //HashMap: {1=哈哈, 2=嘻嘻}

        Iterator<Map.Entry<Integer, String>> it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("key: " + entry.getKey() + "; value: " + entry.getValue());
        }  //key: 1; value: 哈哈
        //key: 2; value: 嘻嘻
    }
}
