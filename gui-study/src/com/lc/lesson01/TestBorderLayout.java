package com.lc.lesson01;

import java.awt.*;

public class TestBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("TestBorderLayout");

        Button west = new Button("west");
        Button east = new Button("east");
        Button north = new Button("north");
        Button south = new Button("south");
        Button center = new Button("center");
//        frame.setLayout(new GridLayout(3,2));

        frame.add(east,BorderLayout.EAST);
        frame.add(west,BorderLayout.WEST);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(north,BorderLayout.NORTH);
        frame.add(center,BorderLayout.CENTER);

        frame.setSize(600,600);
        frame.setVisible(true);



    }
}
