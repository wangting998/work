package com.bh.java.net.net_tcp_edit;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * TCP协议发送数据：
 * A:创建发送端的Socket对象
 * 这一步如果成功，就说明连接已经建立成功了。
 * B:获取输出流，写数据
 * C:释放资源
 */
public class ClientDemo {
    @Test
    public void clientDemoTest1() throws IOException {
        //创建发送端（客户端）Socket对象   //跨域---穿透
        // Socket(InetAddress address, int port)
        //Socket s = new Socket(InetAddress.getByName("192.168.1.101"),8888);
        // Socket(String host, int port)
        Socket s = new Socket("192.168.1.101", 8888);

        //获取输出流，写数据
        // public OutputStream getOutputStream()
        OutputStream os = s.getOutputStream();
        os.write("hello,tcp,I‘m coming...".getBytes());

        //释放资源
        s.close();
    }
}
