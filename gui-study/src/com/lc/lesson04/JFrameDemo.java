package com.lc.lesson04;
import com.sun.deploy.panel.RuleSetViewerDialog;

import javax.swing.*;

public class JFrameDemo {
    public void init() {
        JFrame frame = new JFrame("JFrame 窗口");
        frame.setVisible(true);
        frame.setBounds(100,100,200,200);

        JLabel label=new JLabel("welecome");
        frame.add(label);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JFrameDemo().init();
    }
}
