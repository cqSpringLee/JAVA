package com.lc.wl.study.chat;

import java.net.SocketException;

public class TalkStudent {
    public static void main(String[] args) throws SocketException {
        //开启2线程
        new Thread(new TalkSend(7777,"localhost",9999)).start();
        new Thread(new TalkReceive(8888,"老师")).start();

    }
}
