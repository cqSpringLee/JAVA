package com.lc.lesson01;

import java.awt.*;

public class TestFrame02 {
    public static void main(String[] args) {
        //展示多个窗口 new
        MyFrame myFrame = new MyFrame(100, 300, 300, 300, Color.blue);
        MyFrame myFrame1 = new MyFrame(300, 300, 300, 300, Color.blue);
        MyFrame myFrame2 = new MyFrame(500, 300, 300, 300, Color.blue);

    }
}
class  MyFrame extends Frame {
    static int id = 0; //多个窗口的构造器

    public MyFrame(int x,int y,int w,int h,Color color){
        super("MyFrame+"+(++id));
        setBackground(color);
        setBounds(x,y,w,h);
        setVisible(true);
    }

}