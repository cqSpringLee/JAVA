package com.oop.demo04;

public class Student {
    private String name;
    private  int id;
    private char sex;
    private int age;

    //提供一些方法访问私有数据
    public void setName(String name){
       this.name=name;
    }
    public String getName(){
        return this.name;
    }
    //构造函数
    public Student() {
    }
    public Student(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        if(age>120 || age<0){
            System.out.println("age is wrong,set to 3");
            this.age=3;
        }else{
            this.age = age;

        }
    }

    public int getAge() {
        return age;
    }
}

