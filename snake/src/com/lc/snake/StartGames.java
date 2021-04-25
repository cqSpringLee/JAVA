package com.lc.snake;

import javax.swing.*;

public class StartGames {
    public static void main(String[] args) {
        //1、绘制1个静态框框  JFrame
        JFrame frame = new JFrame("李春的贪吃蛇小游戏");
        int widths=900,heights=720;
        frame.setBounds(10,10,widths,heights);
        frame.setResizable(false); //窗口大小不可以改变.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //设置关闭事件
        //面板加入到frame
        frame.add(new GamePanel());   //清屏
        frame.setVisible(true);
    }
}
