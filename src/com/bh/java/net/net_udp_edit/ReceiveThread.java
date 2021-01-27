package com.bh.java.net.net_udp_edit;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveThread implements Runnable {
    //创建发送端对象
    private DatagramSocket ds;

    public ReceiveThread(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        try {
            while (true) {
                //创建一个包裹（创建数据，并把数据打包）
                byte[] bytes = new byte[1024];
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

                //接收数据
                ds.receive(dp);
                //解析数据
                String ip = dp.getAddress().getHostAddress();
                String s = new String(dp.getData(), 0, dp.getLength());
                System.out.println("from" + ip + "data is :" + s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
