package com.bh.java.net.net_tcp_edit;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo4 {
    public static void main(String[] args) throws IOException {
        // 创建服务器Socket对象
        ServerSocket ss = new ServerSocket(34567);
        //监听客户端连接
        Socket s = ss.accept();
        //封装通道内的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(
                s.getInputStream()));

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        //释放资源
        s.close();
    }
}
