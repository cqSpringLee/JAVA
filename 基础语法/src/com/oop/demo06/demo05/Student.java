package com.oop.demo06.demo05;

//子类继承父类，就会继承所有方法。
public class Student extends Person {
    private String name="student";

    public Student() {
        //隐藏代码，掉用了父类无参数构造。
        super("x");
        System.out.println("student no values");
    }

    public void print(){
        System.out.println("student print");
    }

//    public void test(String name){
//        System.out.println(name);
//        System.out.println(this.name);
//        System.out.println(super.name);
//        System.out.println();
//    }
    public void test01(String name){
        print();
        this.print();
        super.print();
    }

}
