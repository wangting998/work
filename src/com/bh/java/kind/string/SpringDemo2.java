package com.bh.java.kind.string;

public class SpringDemo2 {
    public static void main(String[] args) {

        /**
         * String s = new String(“hello”)和String s = “hello”的区别?
         * 有。前者会创建2个对象，后者创建1个对象。
         *
         * ==:比较引用类型比较的是地址值是否相同
         * equals:比较引用类型默认也是比较地址值是否相同，而String类重写了equals()方法，比较的是内容是否相同。
         */
        String string1 = new String("hello");
        String string2 = "hello";

        System.out.println(string1 == string2); //false
        System.out.println(string1.equals(string2)); //true
    }
}
