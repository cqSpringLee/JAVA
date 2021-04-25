package com.oop.demo07;

public class Application {
    //静态方法和非静态方法区别很大：
    //静态方法是类的方法，非静态是对象的方法.重写，重写只能是public。
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
