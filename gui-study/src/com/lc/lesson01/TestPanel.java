package com.lc.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//解决关闭事件

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();
       //设置布局
        frame.setLayout(null);
        //坐标
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(40, 161, 53));

        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(193,15,60));

        frame.add(panel);
        frame.setVisible(true);

        //监听事件，监听窗口关闭事件
        //适配器模式
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //结束程序
                System.exit(0);
//                super.windowClosing(e);
            }
        });
    }
}
