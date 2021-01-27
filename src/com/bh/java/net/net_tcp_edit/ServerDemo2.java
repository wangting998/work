package com.bh.java.net.net_tcp_edit;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo2 {

    public static void main(String[] args) throws IOException {
        //创建(服务器)接收端的Socket对象
        ServerSocket ss = new ServerSocket(10010);

        //监听客户端连接。
        Socket s = ss.accept();

        //包装通道内的流/获取输入流，读取数据显示在控制台
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
