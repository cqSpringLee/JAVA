package com.oop.demo04;

public class Application {
    public static void main(String[] args) {
        Student s1=new Student();
//        s1.name="";
        s1.setName("xixi");
        s1.getName();
        System.out.printf(s1.getName());
        s1.setAge(121);
        s1.getAge();
        System.out.println(s1.getAge());
    }
}
