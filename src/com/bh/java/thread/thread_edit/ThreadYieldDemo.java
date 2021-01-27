package com.bh.java.thread.thread_edit;

/**
 * public static void yield():暂停当前正在执行的线程对象，并执行其他线程
 */
public class ThreadYieldDemo {
    public static void main(String[] args) {
        //创建线程对象
        ThreadYield ty1 = new ThreadYield();
        ThreadYield ty2 = new ThreadYield();
        ty1.setName("张三");
        ty2.setName("刘二");
        //启动线程
        ty1.start();

        ty1.yield();

        ty2.start();
    }
}
