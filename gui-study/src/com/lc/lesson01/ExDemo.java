package com.lc.lesson01;

import com.sun.org.apache.xml.internal.dtm.ref.ExpandedNameTable;
import sun.security.util.PendingException;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExDemo {
    public static void main(String[] args) {
        //总flame
        Frame frame = new Frame();
        frame.setSize(400,300);
        frame.setLocation(300,400);
        frame.setBackground(Color.BLACK);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,1));

        //four pannel
        Panel p1=new Panel(new BorderLayout());
        Panel p2=new Panel(new GridLayout(2,1));
        Panel p3=new Panel(new BorderLayout());
        Panel p4=new Panel(new GridLayout(2,2));

        p1.add(new Button("ease-1"),BorderLayout.EAST);
        p1.add(new Button("west-1"),BorderLayout.WEST);
        p2.add(new Button("p2-btn-1"));
        p2.add(new Button("p2-btn-2"));

        p3.add(new Button("ease-2"),BorderLayout.EAST);
        p3.add(new Button("west-2"),BorderLayout.WEST);
        for (int i=0;i<4;i++){
            p4.add(new Button("for-"+i));
        }
        p3.add(p4,BorderLayout.CENTER);

        frame.add(p1);
        frame.add(p3);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
//                super.windowClosing(e);
                System.exit(0);
            }
        });


    }
}
