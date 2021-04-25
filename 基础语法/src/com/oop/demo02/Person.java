package com.oop.demo02;

public class Person {
    String name;
    //实例化初始值
    //使用new关键字，必须要有构造器。
    public Person(){
//        this.name="xixi";
    }
    //有参构造,无参构造必须显示定义,空着都行
    public Person(String name){
        this.name=name;
    }

}
