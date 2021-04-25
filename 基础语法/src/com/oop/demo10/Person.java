package com.oop.demo10;

public class Person {
    {
        //代码块
        System.out.println("dongtai code");
    }
    static {
        //静态代码块,只执行一次
        System.out.println("jingtai");
    }

    public Person() {
        System.out.println("gouzao");
    }
}
