package com.lc.lesson01;
import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("my firest");

        frame.setVisible(true);
        frame.setSize(400,400);
//        final Color color = new Color();
        frame.setBackground(new Color(84, 98, 151));

        frame.setLocation(200,200);
        
        frame.setResizable(false);
    }

}
