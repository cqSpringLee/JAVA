package com.oop.demo05;

public class Person {
    protected String name = "person";
    private int money=10_000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void say(){
        System.out.println("person say");
    }

    public void print(){
        System.out.println("person print");
    }

}

