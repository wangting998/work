package com.hb.kind.string;

import org.junit.Test;

/**
 * 线程安全
 * 安全 -- 同步 -- 数据是安全的
 * 不安全 -- 不同步 -- 效率高一些
 *
 * StringBuffer:
 * 		线程安全的可变字符串。
 *
 * StringBuffer和String的区别?
 * 前者长度和内容可变，后者不可变。
 * 如果使用前者做字符串的拼接，不会浪费太多的资源。
 *
 * StringBuffer的构造方法：
 * 		public StringBuffer():无参构造方法
 *		public StringBuffer(int capacity):指定容量的字符串缓冲区对象
 *		public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
 *
 * StringBuffer的方法：
 *		public int capacity()：返回当前容量。	理论值
 *		public int length():返回长度（字符数）。 实际值
 */
public class StringBufferDemo {

    public static void main(String[] args){
        // public StringBuffer():无参构造方法
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.length()); //容器中的字符个数,实际值 0
        System.out.println(stringBuffer.capacity()); //容器的初始容量,理论值 16
        System.out.println("-------------------------");
        // public StringBuffer(int capacity):指定容量的字符串缓冲区对象
        StringBuffer stringBuffer1 = new StringBuffer(10);
        System.out.println(stringBuffer1.length()); //0
        System.out.println(stringBuffer1.capacity()); //10
        System.out.println("-------------------------");
        // public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
        StringBuffer stringBuffer2 = new StringBuffer("hello");
        System.out.println(stringBuffer2.length()); //5 实际字符的个数
        System.out.println(stringBuffer2.capacity()); //21 字符串的length + 初始容量
        System.out.println("-------------------------");
    }

    /**
     * StringBuffer添加功能：
     * public StringBuffer append(String str):
          可以把任意类型数据添加到字符串缓冲区,并返回字符串缓冲区本身
     *
     * public StringBuffer insert(int offset,String str):
          在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
     */
    @Test
    public void addTest(){
        //创建字符串缓冲区对象
        StringBuffer sb = new StringBuffer();

        /**public StringBuffer append(String str):*/
        /*StringBuffer sb2 = sb.append("hello");
        System.out.println("sb:" + sb); //sb:hello
        System.out.println("sb2:" + sb2); //sb2:hello
        System.out.println(sb == sb2); //true*/

        //一步步添加数据
        /*sb.append("hello");
        sb.append(true);
        sb.append(12);
        sb.append(34.56);*/
        //链式编程
        sb.append("hello").append(true).append(12).append(34.56);
        System.out.println("sb:" +sb);  //sb:hellotrue1234.56

        /**public StringBuffer insert(int offset,String
            str):在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
        */
        sb.insert(5,"world");
        System.out.println("sb:" + sb); //helloworldtrue1234.56
    }

    /**
     * StringBuffer的删除功能
     * public StringBuffer deleteCharAt(int index):删除指定位置的字符，并返回本身
     * public StringBuffer delete(int start,int end):删除从指定位置开始指定位置结束的内容，并返回本身
     */
    @Test
    public void deleteTest(){
        //创建对象
        StringBuffer stb = new StringBuffer();

        //添加功能
        stb.append("hello").append("world").append("java");
        System.out.println("stb:" + stb);

        // public StringBuffer deleteCharAt(int index):删除指定位置的字符，并返回本身
        // 需求：我要删除e这个字符，肿么办?
        /*stb.deleteCharAt(1);
        System.out.println("stb:" + stb); //stb:hlloworldjava
        // 需求:我要删除第一个l这个字符，肿么办?
        stb.deleteCharAt(1);
        System.out.println("stb:" + stb);*/

        /**public StringBuffer delete(int start,int
            end):删除从指定位置开始指定位置结束的内容，并返回本身
        */
        //需求：我要删除world这个字符串，怎么办
        //stb.delete(5,10);
        //System.out.println("stb:" + stb); //stb:hellojava

        //需求：我要删除所有的数据
        stb.delete(0,stb.length());
        System.out.println("stb:" + stb); //stb:
    }

    /**
     * StringBuffer的替换功能：
     * public StringBuffer replace(int start,int end,String str):从start开始到end用str替换
     */
    @Test
    public void replaceTest(){
        //创建字符串缓冲区对象
        StringBuffer sb = new StringBuffer();

        //添加数据
        sb.append("hello").append("world").append("java");
        System.out.println("sb:" + sb);

        /**public StringBuffer replace(int start,int end,String
        str):从start开始到end用str替换*/
        //需求“我要把world这个数据替换为节日快快乐
        sb.replace(5,10,"节日快乐");
        System.out.println("sb:" + sb);  //sb:hello节日快乐java
    }

    /**
     * StringBuffer的反转功能：
     * public StringBuffer reverse()
     */
    @Test
    public void reverseTest(){
        // 创建字符串缓冲区对象
        StringBuffer sb = new StringBuffer();
        // 添加数据
        sb.append("杨爱我");
        System.out.println("sb:" + sb);
        //public StringBuffer reverse() 反转
        sb.reverse();
        System.out.println("sb:" + sb);
    }

    /**
     * StringBuffer的截取功能:注意返回值类型不再是StringBuffer本身了
     * public String substring(int start)
     * public String substring(int start,int end)
     */
    @Test
    public void substringTest(){
        // 创建字符串缓冲区对象
        StringBuffer sb = new StringBuffer();
        // 添加元素
        sb.append("hello").append("world").append("java");
        System.out.println("sb:" + sb);

        //截取功能
        // public String substring(int start)
        String s = sb.substring(5);
        System.out.println("s:" + s); //s:worldjava
        System.out.println("sb:" + sb); //sb:helloworldjava

        // public String substring(int start,int end)
        String ss = sb.substring(5,10);
        System.out.println("ss:" + ss); //ss:world
    }

    /**
     * 面试题：
     * 1：String,StringBuffer,StringBuilder的区别?
     *   A:String是内容不可变的，而StringBuffer,StringBuilder都是内容可变的。
     *   B:StringBuffer是同步的，数据安全,效率低;
           StringBuilder是不同步的,数据不安全,效率高
     *
     * 2：StringBuffer和数组的区别?
     *   都可以看出是一个容器
     *   StringBuffer的数据最终是一个字符串数据。
     *   而数组可以放置多种数据，但必须是同一种数据类型的。
     *
     * 3:形式参数问题
     * String作为参数传递
     * StringBuffer作为参数传递
     *
     * 形式参数：
     * 		基本类型：形式参数的改变不影响实际参数
     * 		引用类型：形式参数的改变直接影响实际参数
     *
     * 注意：
     * 		String作为参数传递，效果和基本类型作为参数传递是一样的。
     */
    @Test
    public void StringBufferDemo1() {
        String s1 = "hello";
        String s2 = "world";
        System.out.println(s1 + "--" + s2); //hello--world
        change(s1, s2);
        System.out.println(s1 + "--" + s2); //hello--world

        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("world");
        System.out.println(sb1 + "--" + sb2); //hello--world
        change(sb1,sb2);
        System.out.println(sb1 + "--" + sb2); //hello--worldworld
    }

    private void change(StringBuffer sb1, StringBuffer sb2) {
        sb1 = sb2;
        sb2.append(sb1);
    }

    private static void change(String s1, String s2) {
        s1 = s2;
        s2 = s1 + s2;
    }
}
