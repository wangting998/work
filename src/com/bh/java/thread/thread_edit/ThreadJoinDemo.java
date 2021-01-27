package com.bh.java.thread.thread_edit;

/**
 * public final void join():等待该线程终止。
 */
public class ThreadJoinDemo {
    public static void main(String[] args) {
        //创建线程对象
        ThreadJoin tj1 = new ThreadJoin("李渊");
        ThreadJoin tj2 = new ThreadJoin("李世民");
        ThreadJoin tj3 = new ThreadJoin("李元霸");
        //启动线程
        tj1.start();
        try {
            //public final void join():等待该线程终止。
            tj1.join();
        } catch (InterruptedException e) {
            System.out.println("线程终止失败！");
        }
        tj2.start();
        tj3.start();
    }
}
