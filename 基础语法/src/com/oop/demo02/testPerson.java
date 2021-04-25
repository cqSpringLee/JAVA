package com.oop.demo02;

public class testPerson {
    String name;
    int age;

    public testPerson(int age) {
        this.age = age;
    }

    public testPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public testPerson() {
    }
    public testPerson(String name) {
        this.name = name;
    }
}
