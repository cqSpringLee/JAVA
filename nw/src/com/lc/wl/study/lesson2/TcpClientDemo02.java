package com.lc.wl.study.lesson2;

import javax.print.DocFlavor;
import java.io.*;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClientDemo02 {
    public static void main(String[] args) throws IOException {
        //创建1个socket
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9000);
        //创建1个输出流
        OutputStream os = socket.getOutputStream();
        //读取文件
//        FileInputStream fis = new FileInputStream(new File("../../linux_perf_tools_full.png"));
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\SpringLee\\IdeaProjects\\JAVA\\nw\\src\\com\\lc\\wl\\study\\linux_perf_tools_full.png"));
        //写出文件
        byte[] buffer = new byte[1024];
        int len;
        while ((len=fis.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        //通知服务器，我几经结束了
        socket.shutdownOutput();
        //确定服务器接收完毕，才能够断开连接
        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer2=new byte[2014];
        int len2;
        while((len2=inputStream.read(buffer2))!=-1){
            baos.write(buffer2,0,len2);
        }

        //关闭资源
        fis.close();
        os.close();
        socket.close();
    }
}
