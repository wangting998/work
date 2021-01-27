package com.bh.java.thread.thread_edit;

import java.util.Date;

public class ThreadStop extends Thread {
    @Override
    public void run() {
        System.out.println("开始执行：" + new Date());

        //休息10秒钟，不要打扰
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("线程被终止了");
        }

        System.out.println("结束执行：" + new Date());
    }
}
