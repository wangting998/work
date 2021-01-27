package com.bh.java.thread.thread_edit;

import java.util.Date;

public class ThreadSleep extends Thread {
    @Override
    public void run() {
        for (int x = 0; x < 20; x++) {
            System.out.println(getName() + ":" + x + ",日期" + new Date());
            //睡眠
            //困了，休息一秒钟
            try {
                /**
                 * 线程休眠
                 * public static void sleep(long millis)
                 */
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
