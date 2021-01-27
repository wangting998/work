package com.bh.java.thread.thread_edit;

/**
 * 自定义ThreadJoin类,继承Thread类
 * ThreadJoin类里面重写run()
 */
public class ThreadJoin extends Thread {
    public ThreadJoin() {

    }

    public ThreadJoin(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int x = 0; x < 20; x++) {
            System.out.println(getName() + ":" + x);
        }
    }
}
