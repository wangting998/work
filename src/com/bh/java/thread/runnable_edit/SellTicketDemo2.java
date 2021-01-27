package com.bh.java.thread.runnable_edit;

import org.junit.Test;

public class SellTicketDemo2 {
    @Test
    public void sellTicketDemoTest2() {
        // 创建资源对象
        SellTicket2 st = new SellTicket2();
        //创建三个线程对象
        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口1");
        Thread t3 = new Thread(st, "窗口1");

        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
