package com.lc.wl.study.chat;

import java.net.SocketException;

public class TalkTeacher {
    public static void main(String[] args) throws SocketException {
        new Thread(new TalkSend(5555,"localhost",8888)).start();
        new Thread(new TalkReceive(9999,"学生")).start();
    }
}
