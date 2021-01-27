package com.bh.java.gather.list_son_edit;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Vector的特有功能
 * 1.添加功能
 * public void addElement (Object obj)
 * 2：获取功能
 * public Object elementAt(int index)		--  get()
 * public Enumeration elements()			--	Iterator iterator()
 * boolean hasMoreElements()			hasNext()
 * Object nextElement()				next()
 * JDK升级的原因：
 * A:安全
 * B:效率
 * C:简化书写
 */
public class VactorDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        Vector v = new Vector();
        //添加功能  public void addElement (Object obj)
        v.addElement("hello");
        v.addElement("world");
        v.addElement("java");
        //遍历
        for (int x = 0; x < v.size(); x++) {
            String s = (String) v.elementAt(x);   //获取功能public Object elementAt(int index)
            System.out.println(s);
        }
        System.out.println("-----------");

        //枚举遍历
        //Enumeration接口中定义了一些方法，通过这些方法可以枚举（一次获得一个）对象集合中的元素。
        //获取功能  public Enumeration elements()			--	Iterator iterator()
        //boolean hasMoreElements()			hasNext()
        //Object nextElement()				next()
        Enumeration en = v.elements();//返回的是实现类的对象
        while (en.hasMoreElements()) {
            String s = (String) en.nextElement();
            System.out.println(s);
        }
    }
}
