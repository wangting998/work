package com.bh.java.gather.list_edit;

import com.bh.java.gather.collection_edit.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo6 {
    @Test
    public void listTest6() {
        // 创建集合对象
        List list = new ArrayList();
        // 创建学生对象
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李师", 88);
        Student s3 = new Student("汪武", 38);

        // 把学生添加到集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);
        // 遍历
        // 迭代器遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Student s = (Student) iterator.next();
            System.out.println(s.getName() + "---" + s.getAge());
            //张三---18
            //李师---88
            //汪武---38
        }
        System.out.println("--------");
        // 普通for循环
        for (int x = 0; x < list.size(); x++) {
            Student s = (Student) list.get(x);
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
