package com.bh.java.thread.runnable_edit;

/**
 * 步骤：
 * A:自定义类MyRunnable实现Runnable接口
 * B:重写run()方法
 */
public class MyRunnable implements Runnable {
    //重写run()方法
    @Override
    public void run() {
        for (int x = 0; x < 20; x++) {
            System.out.println(Thread.currentThread().getName() + ":" + x);
        }
    }
}
