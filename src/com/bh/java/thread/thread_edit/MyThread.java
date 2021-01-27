package com.bh.java.thread.thread_edit;

/**
 * 自定义线程类，该类要重写run()方法
 * 步骤:
 * A:自定义类MyThread继承Thread类。
 * B:MyThread类里面重写run()
 */
public class MyThread extends Thread {
    //MyThread类里面重写run()
    @Override
    public void run() {
        //代码
        System.out.println("北京市海淀区复兴路11号");
    }
}
