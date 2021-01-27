package com.bh.java.net.net_tcp_edit;

import org.junit.Test;

import java.io.*;
import java.net.Socket;

/**
 * 客户端键盘录入，服务器端输出到控制台
 */
public class ClientDemo2 {
    public static void main(String[] args) throws IOException {
        //创建发送端(客户端)Socket对象
        //Socket s = new Socket("192.168.1.101",10010);
        Socket s = new Socket("192.168.1.101", 10010);
        //封装键盘录入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = br.readLine()) != null) {
            //键盘录入数据要自定义标记结束
            if ("886".equals(line)) {
                break;
            }
            //获取输出流，写数据
            // public OutputStream getOutputStream()
            OutputStream os = s.getOutputStream();
            os.write("hello,tcp,I‘m coming...".getBytes());
        }

        //释放资源
        //bw.close();//bw的底层是s.getOutputStream()它已关闭bw就没有了
        //br.close();键盘录入结束就自动关闭
        s.close();
    }
}
