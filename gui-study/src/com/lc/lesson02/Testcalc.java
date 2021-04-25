package com.lc.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Testcalc {
    public static void main(String[] args) {
        new Calculator();
    }
}
//计算器类
 class Calculator extends Frame{
     public Calculator(){
         //3文本框
         TextField num1 = new TextField(10);
         TextField num2 = new TextField(10);
         TextField num3 = new TextField(20);
         //1个button
         Button button = new Button("=");
         button.addActionListener(new MyCalculatorListener(num1,num2,num3));
         //1个标签
         Label label = new Label("+");
         setLayout(new FlowLayout());
         add(num1);
         add(label);
         add(num2);
         add(button);
         add(num3);
         pack();
         setVisible(true);
     }
 }
 //监听类
 class MyCalculatorListener implements ActionListener{
    //获取3个变量
     private TextField num1,num2,num3;
     public MyCalculatorListener(TextField num1,TextField num2,TextField num3) {
         this.num1=num1;
         this.num2=num2;
         this.num3=num3;
     }
     @Override
     public void actionPerformed(ActionEvent e) {
         //1、获得加数与备加数
         int n1=Integer.parseInt(num1.getText());
         int n2=Integer.parseInt(num2.getText());
         //2、2个数相加
         num3.setText(""+(n1+n2));
         // 3、清楚前2个框
         num1.setText("");
         num2.setText("");

     }
 }
