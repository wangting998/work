package com.bh.java.thread.thread_edit;

/**
 * 自定义ThreadDaemon类,继承Thread类
 * ThreadDaemon类里面重写run()
 */
public class ThreadDaemon extends Thread {

    //ThreadDaemon类里面重写run()
    @Override
    public void run() {
        for (int x = 0; x < 20; x++) {
            System.out.println(getName() + ":" + x);
        }
    }
}
