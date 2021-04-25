package com.oop.demo08.demo07;

public class Application {
    public static void main(String[] args) {
        //方法的调用只和左边有关。
        A a= new A();
        a.test();
        //父类的引用指向了子类
        B c =new A();
        c.test();
        B b=new B();
        b.test();

    }
}
