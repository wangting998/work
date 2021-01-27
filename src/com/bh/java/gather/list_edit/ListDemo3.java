package com.bh.java.gather.list_edit;

import com.bh.java.gather.collection_edit.Student;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 存储自定义对象并遍历
 */
public class ListDemo3 {
    @Test
    public void listTest3() {
        //创建集合对象
        List list = new ArrayList();
        //创建学生对象
        Student s1 = new Student("王楠", 21);
        Student s2 = new Student("曹胜南", 19);
        Student s3 = new Student("冯莹莹", 21);
        //把学生添加到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);
        // 遍历集合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Student s = (Student) iterator.next();
            System.out.println(s.getName() + "---" + s.getAge());
            //王楠---21,曹胜南---19,冯莹莹---21
        }
    }
}
