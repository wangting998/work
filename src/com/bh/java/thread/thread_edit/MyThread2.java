package com.bh.java.thread.thread_edit;

/**
 * A:自定义类MyThread2继承Thread类。
 * B:MyThread2类里面重写run()
 */
public class MyThread2 extends Thread {
    public MyThread2() {

    }

    public MyThread2(String name) {
        super(name);
    }

    //MyThread2类里面重写run()
    @Override
    public void run() {
        for (int x = 0; x < 10; x++) {
            System.out.println(getName() + ":" + x);
        }
    }
}
