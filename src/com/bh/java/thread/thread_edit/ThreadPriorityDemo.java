package com.bh.java.thread.thread_edit;

/**
 * 线程没有设置优先级,肯定有默认优先级。
 * 那么，默认优先级是多少呢?
 * 如何获取线程对象的优先级?
 * public final int getPriority():返回线程对象的优先级
 * 如何设置线程对象的优先级呢?
 * public final void setPriority(int newPriority)：更改线程的优先级。
 * <p>
 * 注意：
 * 线程默认优先级是5。
 * 线程优先级的范围是：1-10
 * <p>
 * IllegalArgumentException:非法参数异常。
 * 抛出的异常表明向方法传递了一个不合法或不正确的参数。
 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        //创建线程对象
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();
        tp1.setName("东方不败");
        tp2.setName("岳不群");
        tp3.setName("林平之");

        //获取默认优先级
        System.out.println(tp1.getPriority()); //5
        System.out.println(tp2.getPriority()); //5
        System.out.println(tp3.getPriority()); //5

        //设置线程优先级
        //tp1.setPriority(100000); //IllegalArgumentException

        //设置正确的线程优先级
        tp1.setPriority(10);
        tp2.setPriority(1);
        //启动线程
        tp1.start();
        tp2.start();
        tp3.start();
    }
}
