package com.bh.java.thread.thread_edit;

public class ThreadYield extends Thread {
    @Override
    public void run() {
        for (int x = 0; x < 20; x++) {
            System.out.println(getName() + ":" + x);
        }
    }
}
