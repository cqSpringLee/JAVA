package com.oop.demo12;

import javax.xml.bind.SchemaOutputResolver;

public class Outer {
    private int id=10;
    public void out(){
        System.out.println("外部类方法");
    }
    class Inner{
        public void in(){
            System.out.println("内部类方法");
        }
        public void getID(){
            System.out.println("xix"+id);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        //通过外部类实例化内部类
//        outer.new Inner();
        Inner inner = outer.new Inner();
        inner.getID();

    }
}

