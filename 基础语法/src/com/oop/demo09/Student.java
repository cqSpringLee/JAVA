package com.oop.demo09;

public class Student extends Person {
    public void go(){
        System.out.println("go");
    }

    @Override
    public void run() {
        super.run();
    }
    public void eat(){
        System.out.println("eat");
    }
}
