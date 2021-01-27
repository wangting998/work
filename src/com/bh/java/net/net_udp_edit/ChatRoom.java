package com.bh.java.net.net_udp_edit;

import java.io.IOException;
import java.net.DatagramSocket;

/**
 * 通过多线程聊天，可以实现在一个窗口发送、接收数据
 */
public class ChatRoom {
    public static void main(String[] args) throws IOException {
        DatagramSocket dsSend = new DatagramSocket();
        DatagramSocket dsReceive = new DatagramSocket(12378);
        SendThread st = new SendThread(dsSend);
        ReceiveThread rt = new ReceiveThread(dsReceive);

        Thread t1 = new Thread(st);
        Thread t2 = new Thread(rt);

        //t1.stop();

        t1.start();
        t2.start();
    }
}
