package com.bh.java.net.net_tcp_edit;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo3 {
    public static void main(String[] args) throws IOException {
        // 创建服务器Socket对象
        ServerSocket ss = new ServerSocket(12345);
        //监听客户端连接
        Socket s = ss.accept();
        //封装通道内的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(
                s.getInputStream()));
        // 封装文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            //刷新
            bw.flush();
        }
        //释放资源
        bw.close();
        s.close();  //只需释放两个
        // br.close();
        // ss.close();
    }
}
