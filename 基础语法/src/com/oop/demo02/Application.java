package com.oop.demo02;

public class Application {
    public static void main(String[] args) {
//        Student xiaoming = new Student();
//        Student xiaohong = new Student();
//        xiaohong.name="xixi";
//        xiaohong.age=11;
//        System.out.println(xiaoming.name);
//        System.out.println(xiaohong.name);
//        System.out.println(xiaohong.age);
        //实例化一个对象
        Person person=new Person();
        System.out.println(person.name);
        Person person1=new Person("haha");
        System.out.println(person1.name);

    }

}


