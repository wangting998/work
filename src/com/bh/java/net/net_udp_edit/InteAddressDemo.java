package com.bh.java.net.net_udp_edit;

import org.junit.Test;

import java.net.InetAddress;

/**
 * 网络编程三要素：
 * A:IP地址
 * B:端口
 * C:协议
 * <p>
 * IP地址:
 * 网络中计算机唯一标识。
 * <p>
 * 计算机只能识别二进制的数据，所以IP地址是一个二进制的数据
 * 但IP地址不是二进制
 * <p>
 * IP地址的组成：网络号段+主机号段
 * A类：第一号段为网络号段+后三段的主机号段
 * 一个网络号：256*256*256 = 16777216
 * B类：前二号段为网络号段+后二段的主机号段
 * 一个网络号：256*256 = 65536
 * C类：前三号段为网络号段+后一段的主机号段
 * 一个网络号：256
 * <p>
 * IP地址的分类：
 * A类	1.0.0.1---127.255.255.254
 * (1)10.X.X.X  是私有地址(私有地址是在互联网中不用，而被用在局域网络中)
 * (2)127.X.X.X 是保留地址，用于循环测试
 * B类	128.0.0.1---191.255.255.254
 * 172.16.0.0---172.31.255.255是私有地址。
 * 169.254.X.X是保留地址。
 * C类	192.0.0.1---223.255.255.254	192.168.X.X是私有地址
 * D类	224.0.0.1---239.255.255.254
 * E类	240.0.0.1---247.255.255.254
 * <p>
 * DOS命令：
 * ipconfig 查看本机ip地址
 * ping 后面跟ip地址。测试本机与指定的ip地址间的通信是否正常
 * <p>
 * 特殊的IP地址：
 * 127.0.0.1 回环地址(表示本机)   localhost
 * x.x.x.255 广播地址
 * x.x.x.0 网络地址
 * <p>
 * 端口号：
 * 正在运行的程序的标识。
 * 有效端口：0~65535，其中0~1024系统使用或保留端口
 * 10086
 * 协议：
 * 通信规则
 * <p>
 * UDP：
 * 数据打包
 * 数据大小有限制
 * 不建立连接
 * 速度快
 * 不可靠
 * <p>
 * TCP：
 * 建立连接通道
 * 数据无限制
 * 速度慢
 * 可靠
 */
public class InteAddressDemo {
    @Test
    public void inteAddressTest1() throws Exception {
        // 获得本地主机的InetAddresss对象   //getLocalHost()返回本地主机的地址。
        InetAddress local = InetAddress.getLocalHost();
        // 获得百度网主机的InetAdderss 对象  获得主机名指定的InetAddress对象
        InetAddress remote = InetAddress.getByName("www.baidu.com");//
        //直接去获取到本机的IP地址
        System.out.println("本机的IP地址：" + local.getHostAddress());
        // 输出本地主机名
        System.out.println("本机的主机名：" + local.getHostName());

        // 输出百度网主机IP地址
        System.out.println("百度网主机ip：" + remote.getHostAddress());
        // 输出百度网主机名
        System.out.println("百度网主机名：" + remote.getHostName());
    }


    /**
     * 类没有构造方法：
     * A:成员全部是静态的(Math,Arrays,Collections)
     * B:单例设计模式(Runtime)
     * C:类中有静态方法返回该类的对象(InetAddress)
     * class Demo {
     * private Demo(){}
     * <p>
     * public static Demo getXxx() {
     * return new Demo();
     * }
     * }
     * <p>
     * InetAddress成员方法：
     * public static InetAddress getByName(String host):
     * 根据主机名或者IP地址的字符串得到IP地址对象
     */
    @Test
    public void inteAddressTest2() throws Exception {
        // public static InetAddress getByName(String host)
        //根据主机名或者IP地址的字符串得到IP地址对象
        InetAddress address = InetAddress.getByName("192.168.12.63");
        System.out.println("address:" + address); //address:/192.168.12.63

        //获取两数据：主机名，IP地址
        // public String getHostName()  主机名
        String name = address.getHostName();
        //public String getHostAddress() IP地址
        String ip = address.getHostAddress();
        System.out.println(name + "--" + ip); //192.168.12.63--192.168.12.63
    }
}
