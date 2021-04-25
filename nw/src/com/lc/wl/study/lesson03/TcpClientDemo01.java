package com.lc.wl.study.lesson03;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.net.Socket;

public class TcpClientDemo01 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String msg="hello";
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 9090;
        DatagramPacket packet = new DatagramPacket(msg.getBytes(),0,msg.getBytes().length,localhost,port);
        socket.send(packet);
        socket.close();

    }
}
