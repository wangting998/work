package com.bh.java.thread.runnable_edit;

/**
 * 如何解决线程安全问题
 * <p>
 * 要想解决问题，就要知道哪些原因会导致出问题:
 * (而且这些原因也是判断一个程序是否会有线程安全问题的标准)
 * A:是否是多线程环境
 * B:是否有共享数据
 * C:是否有多条语句操作共享数据
 * <p>
 * 程序中是否存在以上问题
 * A:是否是多线程环境	是
 * B:是否有共享数据	    是
 * C:是否有多条语句操作共享数据	是
 * <p>
 * 由此可见程序出现问题是正常的，因为它满足出问题的条件。
 * 接下来是如何解决问题
 * A和B的问题改变不了，只能想办法去把C改变一下
 * 思想：
 * 把多条语句操作共享数据的代码给包成一个整体，让某个线程在执行的时候，其它不能执行
 * 问题是怎么包?
 * Java给我们提供了：同步机制。
 * <p>
 * 同步代码块：
 * synchronized(对象){
 * 需要同步的代码;
 * }
 * <p>
 * A:对象是什么
 * 可以随便创建一个对象测试
 * B:需要同步的代码
 * 把多条语句操作共享数据的代码的部分给包起来
 * <p>
 * 注意：
 * 同步可以解决安全问题的根本原因就在那个对象上。该对象如同锁的功能。
 * 多个线程必须是同一把锁。
 */
public class SellTicketDemo3 {
    public static void main(String[] args) {
        // 创建资源对象
        SellTicket3 st = new SellTicket3();
        //创建三个线程对象
        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口1");
        Thread t3 = new Thread(st, "窗口1");
        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
