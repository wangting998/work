package com.bh.java.net.net_udp_edit;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 * UDP协议发送数据：
 * A:创建发送端Socket对象
 * B:创建数据，并把数据打包
 * C:调用Socket对象的发送方法发送数据包
 * D:释放资源
 */
public class SendDemo {
    @Test
    public void sendDemoTest1() throws IOException {
        //创建发送端对象
        //DatagramSocket()
        DatagramSocket ds = new DatagramSocket();

        //创建数据，并把数据打包
        //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        //创建数据
        byte[] bytes = "hello,udp,我来了".getBytes();
        //长度
        int length = bytes.length;
        //地址对象
        InetAddress address = InetAddress.getByName("192.168.1.106");
        //端口
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes, length, address, port);

        //调用Socket对象的发送方法发送数据包
        //public void send(DatagramPacket p)
        ds.send(dp);
        //释放资源
        ds.close();
    }

    /**
     * 数据来自键盘录入
     * 键盘录入数据要控制录入结束
     */
    @Test
    public void sendDemoTest2() throws IOException {
        //创建发送端的Socket对象
        DatagramSocket ds = new DatagramSocket();
        //封装键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = br.readLine()) != null) {
            //如果在控制台输入886就退出
            if ("886".equals(line)) {
                break;
            }
            //创建数据并打包
            byte[] bytes = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length,
                    InetAddress.getByName("192.168.1.106"), 12345);
            //发送数据
            ds.send(dp);
        }
        //释放资源
        ds.close();
    }
}
