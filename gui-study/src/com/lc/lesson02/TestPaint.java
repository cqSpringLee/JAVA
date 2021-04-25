package com.lc.lesson02;

import java.awt.*;

public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();

    }
}
class MyPaint extends Frame{
    public void loadFrame(){
        setBounds(200,200,600,500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.drawOval(100,100,100,100);
        g.setColor(Color.green);
        g.drawRect(100,100,100,100);

    }
}
