package com.lc.wl.study.lesson1;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
    public static void main(String[] args) throws UnknownHostException {
//        new Inet4Address();
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        System.out.println(inetAddress);
        System.out.println(inetAddress.getHostName());
        InetAddress inetAddress1 = InetAddress.getByName("www.baidu.com");
        System.out.println(inetAddress1);
        System.out.println(inetAddress1.getAddress());
        System.out.println(inetAddress1.getCanonicalHostName());
        System.out.println(inetAddress1.getHostAddress());
        System.out.println(inetAddress1.getHostName());
    }
}
