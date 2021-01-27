package com.bh.java.gather.collection_edit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class StudentDemo {
    @Test
    public void CollectionTest4() {
        //创建集合对象
        Collection c = new ArrayList();

        //创建学生对象
        Student s1 = new Student("李梓萌", 27);
        Student s2 = new Student("李思思", 30);
        Student s3 = new Student("康辉", 33);
        Student s4 = new Student("海霞", 25);
        Student s5 = new Student("小尼", 22);

        //把学生添加到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        c.add(s5);

        //遍历
        // Object[] toArray():把集合转成数组，可以实现集合的遍历
        Object[] objects = c.toArray();
        //遍历数组
        for (int x = 0; x < objects.length; x++) {
            //System.out.println(objects[x]); //出不来结果
            Student s = (Student) objects[x];
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
