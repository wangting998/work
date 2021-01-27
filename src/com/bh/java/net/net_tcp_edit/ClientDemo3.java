package com.bh.java.net.net_tcp_edit;

import org.junit.Test;

import java.io.*;
import java.net.Socket;

/**
 * 客户端键盘录入，服务器输出文本文件
 */
public class ClientDemo3 {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.1.101", 12345);
        //封装键盘录入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 封装通道内的数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                s.getOutputStream()));
        String line = null;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            bw.write(line);
            bw.newLine();
            //刷新
            bw.flush();
        }
        //释放资源
        // bw.close();
        // br.close();
        s.close();   //只释放s.close();
    }
}
