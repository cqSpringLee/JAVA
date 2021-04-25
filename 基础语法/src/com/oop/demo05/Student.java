package com.oop.demo05;
//子类继承父类，就会继承所有方法。
public class Student extends Person{
    private String name="student";

    public void say(){
        System.out.println("student say");
    }

    public void print(){
        System.out.println("student print");
    }


    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        System.out.println();
    }
}
