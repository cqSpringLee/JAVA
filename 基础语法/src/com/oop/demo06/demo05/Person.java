package com.oop.demo06.demo05;

public class Person {
    protected String name = "person";
    private int money=10_000;

    public Person() {
        System.out.println("person no values!");
    }
    public Person(String name) {
        System.out.println("person no values!");
    }

    public void print(){
        System.out.println("person print");
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void say(){
        System.out.println("person say");
    }


}

