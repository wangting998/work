package com.bh.java.net.net_udp_edit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendThread implements Runnable {
    private DatagramSocket ds;

    public SendThread(DatagramSocket ds) {

        this.ds = ds;
    }

    @Override
    public void run() {
        //封装键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            while ((line = br.readLine()) != null) {
                //如果在控制台输入886就退出
                if ("886".equals(line)) {
                    break;
                }
                //创建数据并打包
                byte[] bytes = line.getBytes();
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length,
                        InetAddress.getByName("192.168.1.106"), 12378);
                //发送数据
                ds.send(dp);
            }
            //释放资源
            ds.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
