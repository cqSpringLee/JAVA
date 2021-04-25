package com.lc.wl.study.lesson2;


import sun.security.rsa.RSAUtil;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TcpServerDemo02 {
    public static void main(String[] args) throws IOException {
        //创建服务
        ServerSocket serverSocket = new ServerSocket(9000);
        //监听客户端连接
        Socket socket = serverSocket.accept();
        //获取输入流
        InputStream is = socket.getInputStream();

        //文件输出
        FileOutputStream fos = new FileOutputStream(new File("receive.png"));
        byte[] buffer= new byte[1024];
        int len;
        while ((len=is.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }

        //通知客户端我接收完毕了
        OutputStream os = socket.getOutputStream();
        System.out.println("0k");
        os.write("i am ok".getBytes());
        System.out.println("ok");

        fos.close();
        is.close();
        socket.close();
        serverSocket.close();


    }
}
