package com.bh.java.net.net_udp_edit;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDP协议接收数据：
 * A:创建接收端Socket对象
 * B:创建一个数据包(接收容器)
 * C:调用Socket对象的接收方法接收数据
 * D:解析数据包，并显示在控制台
 * E:释放资源
 */

public class ReceiveDemo {
    @Test
    public void receiveTest1() throws IOException {
        //创建接收端Socket对象
        //DatagramSocket(int port)
        DatagramSocket ds = new DatagramSocket(10086);

        //创建一个数据包（接收容器）
        //DatagramPacket(byte[] buf, int length)
        byte[] bytes = new byte[1024];
        int length = bytes.length;
        DatagramPacket dp = new DatagramPacket(bytes, length);

        //调用Socket对象的接收方法接收数据
        // public void receive(DatagramPacket p)
        ds.receive(dp); //阻塞式

        //解析数据包，并显示在控制台
        //获取对方的ip
        // public InetAddress getAddress()
        InetAddress address = dp.getAddress();
        String ip = address.getHostAddress();
        // public byte[] getData():获取数据缓冲区
        // public int getLength():获取数据的实际长度
        byte[] bytes2 = dp.getData();
        int len = dp.getLength();
        String s = new String(bytes2, 0, len);
        System.out.println(ip + "传递数据：" + s);

        //释放资源
        ds.close();
    }

    @Test
    public void receiveTest2() throws IOException {
        //创建接收端的Socket对象
        DatagramSocket ds = new DatagramSocket(12345);

        while (true) {
            //创建一个包裹
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

            //接收数据
            ds.receive(dp);
            //解析数据
            String ip = dp.getAddress().getHostAddress();
            String s = new String(dp.getData(), 0, dp.getLength());
            System.out.println("from" + ip + "data is :" + s);
        }
        //释放资源
        // 接收端应该一直开着等待接收数据，无需关闭
        //ds.close();
    }
}
