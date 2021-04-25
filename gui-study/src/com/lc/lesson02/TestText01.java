package com.lc.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestText01 {
    public static void main(String[] args) {
        new MyFrame();

    }
}
class MyFrame extends Frame{
    public MyFrame(){
        TextField textField = new TextField();
        add(textField);

        MyActionListener2 myActionListener2 = new MyActionListener2();
        textField.addActionListener(myActionListener2);

        //设置编码
        textField.setEchoChar('*');

        setVisible(true);
        pack();
    }
}
class MyActionListener2 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field =(TextField)e.getSource();
        System.out.println(field.getText());
        field.setText("");

    }
}
