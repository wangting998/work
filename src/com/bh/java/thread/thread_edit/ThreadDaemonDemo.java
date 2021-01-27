package com.bh.java.thread.thread_edit;

/**
 * public final void setDaemon(boolean on):将该线程标记为守护线程或用户线程。
 * 当正在运行的线程都是守护线程时，Java 虚拟机退出。 该方法必须在启动线程前调用。
 */
public class ThreadDaemonDemo {
    public static void main(String[] args) {
        //创建线程对象
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();
        //public final void setName(String name):设置线程的名称
        td1.setName("关羽");
        td2.setName("张飞");
        //设置守护线程
        td1.setDaemon(true);
        td2.setDaemon(true);
        //启动线程
        td1.start();
        td2.start();

        //public static Thread currentThread():返回当前正在执行的线程对象
        Thread.currentThread().setName("刘备");
        for (int x = 0; x < 5; x++) {
            System.out.println(Thread.currentThread().getName() + ":" + x);
        }
    }
}
