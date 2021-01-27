package com.bh.java.thread.thread_edit;

/**
 * 获取线程对象的名称
 * public final String getName():获取线程的名称。
 * 设置线程对象的名称
 * public final void setName(String name):设置线程的名称
 * <p>
 * 针对不是Thread类的子类中如何获取线程对象名称呢?
 * public static Thread currentThread():返回当前正在执行的线程对象
 * Thread.currentThread().getName()
 */
public class MyThreadDemo2 {
    /**
     * 创建线程对象
     * 无参
     * 有参
     * 启动线程
     * <p>
     * 获取main方法所在的线程对象的名称
     *
     * @param args
     */
    public static void main(String[] args) {
        //创建线程对象
        //无参构造+setXxx ()
        //MyThread2 my1 = new MyThread2();
        //MyThread2 my2 = new MyThread2();
        //调用方法设置名称
        //public final void setName(String name):设置线程的名称
        //my1.setName("康老师");
        //my2.setName("李老师");
        //启动线程
        //my1.start();
        //my2.start();

        //带参构造方法为线程命名
        //MyThread2 my1 = new MyThread2("康老师");
        //MyThread2 my2 = new MyThread2("李老师");
        //my1.start();
        //my2.start();

        //获取main方法所在的线程对象的名称
        //public static Thread currentThread():返回当前正在执行的线程对象
        System.out.println(Thread.currentThread().getName()); //main
    }
}
