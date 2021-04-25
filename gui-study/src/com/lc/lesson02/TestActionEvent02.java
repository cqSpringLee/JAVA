package com.lc.lesson02;

import com.sun.xml.internal.bind.v2.model.annotation.AbstractInlineAnnotationReaderImpl;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionEvent02 {
    public static void main(String[] args) {
        Frame frame = new Frame("start-stop");
        Button button1 = new Button("start");
        Button button2 = new Button("stop");
        button2.setActionCommand("button2-stop");
        MyMonitor myMonitor = new MyMonitor();


        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);
        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
}
class MyMonitor implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("click + "+e.getActionCommand());

    }
}

