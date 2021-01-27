package com.bh.java.thread.runnable_edit;

public class SellTicket2 implements Runnable {
    // 为了让多个线程对象共享这100张票，应该用静态修饰
    private static int tickets = 100;

    @Override
    public void run() {
        //一直有票
        while (true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName()
                        + "正在出售第" + (tickets--) + "张票");
            }
        }
    }
}
