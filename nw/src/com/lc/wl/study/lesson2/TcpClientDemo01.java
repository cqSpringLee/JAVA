package com.lc.wl.study.lesson2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClientDemo01 {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream os = null;
        try {
            InetAddress serverIp = InetAddress.getByName("127.0.0.1");
            int port = 9999;
            //创建1个socket连接
            socket = new Socket(serverIp,port);
            //发送消息
            os = socket.getOutputStream();
            os.write("hello,lc".getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(os !=null){
                try {
                    os.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (socket != null){
                try {
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
