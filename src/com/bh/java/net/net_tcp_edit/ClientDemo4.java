package com.bh.java.net.net_tcp_edit;

import org.junit.Test;

import java.io.*;
import java.net.Socket;

/**
 * 客户端文本文件，服务器输出到控制台
 */
public class ClientDemo4 {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.1.101", 34567);
        //封装文本文件
        BufferedReader br = new BufferedReader(new FileReader(
                "a.txt"));
        // 封装通道内的流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                s.getOutputStream()));
        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            //刷新
            bw.flush();
        }
        //释放资源
        br.close();
        s.close();
    }
}
