package com.lc.lesson3;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class TestWindow {
    public static void main(String[] args) {
        new WindFrame();

    }
}

class WindFrame extends Frame{
    public WindFrame() {
        setBackground(Color.blue);
        setBounds(100,100,200,200);
        setVisible(true);
        addWindowListener(new MyWindowListener());
    }

    class MyWindowListener extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e) {
            setVisible(false);
            System.exit(0);
        }
    }
}
