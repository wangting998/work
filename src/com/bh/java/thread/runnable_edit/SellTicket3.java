package com.bh.java.thread.runnable_edit;

public class SellTicket3 implements Runnable {
    // 为了让多个线程对象共享这100张票，应该用静态修饰
    private static int tickets = 100;
    //创建锁对象
    private Object obj = new Object();

    /*@Override
	public void run() {
		while (true) {
			synchronized(new Object()){
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "正在出售第"
							+ (tickets--) + "张票");
				}
			}
		}
	}
*/
    @Override
    public void run() {
        //一直有票
        while (true) {
            synchronized (obj) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");
                }
            }
        }
    }
}
