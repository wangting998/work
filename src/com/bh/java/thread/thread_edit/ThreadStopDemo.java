package com.bh.java.thread.thread_edit;

/**
 * public final void stop():线程停止，过时了，还可以使用。
 * public void interrupt():中断线程。 把线程的状态终止，并抛出一个InterruptedException。
 */
public class ThreadStopDemo {
    public static void main(String[] args) {
        //创建对象
        ThreadStop ts = new ThreadStop();
        //启动线程
        ts.start();

        //超过三秒不醒过来，后果自负...
        try {
            Thread.sleep(30000);
            //public final void stop():线程停止，过时了，还可以使用。
            //ts.stop();
            //public void interrupt():中断线程。 把线程的状态终止，并抛出一个InterruptedException。
            ts.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
