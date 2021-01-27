package com.bh.java.gather.collection_edit;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 练习：用集合存储5个学生对象，并把学生对象进行遍历。用迭代器遍历。
 * 注意：
 * A:自己的类名不要和我们学习的要使用的API中的类名相同。
 * B:复制代码的时候，很容易把那个类所在的包也导入过来，容易出现不能理解的问题。
 */
public class IteratorTest {
    @Test
    public void CollectionTest6() {
        // 创建集合对象
        Collection c = new ArrayList();
        // 创建学生对象
        Student s1 = new Student("李梓萌", 27);
        Student s2 = new Student("李思思", 30);
        Student s3 = new Student("康辉", 33);
        Student s4 = new Student("海霞", 25);
        Student s5 = new Student("小尼", 22);
        // 把学生添加到集合中
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        c.add(s5);
        //遍历
        Iterator iterator = c.iterator();
        /**1.hasNext()和Next()区别
         * hasNext()和Next()效果其实是一样的，
         * 系统都会等待输入下一个字符，只是返回值不同，
         * hasNext()会返回true，next()返回输入的字符。
         *
         * 2.iterator.hasNext() 判断集合里是不是已经没有元素了
         *如果有就用it.next();
         */
        while (iterator.hasNext()) {
            // System.out.println(it.next());
            Student s = (Student) iterator.next();
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
