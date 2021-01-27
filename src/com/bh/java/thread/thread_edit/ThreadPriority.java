package com.bh.java.thread.thread_edit;

/**
 * 自定义ThreadPriority类，继承Thread类
 * 在ThreadPriority中重写run方法
 */
public class ThreadPriority extends Thread {
    //在ThreadPriority中重写run方法
    //@Override是伪代码,表示重写。
    @Override
    public void run() {
        for (int x = 0; x < 20; x++) {
            System.out.println(getName() + ":" + x);
        }
    }
}
