package com.oop.demo11;
//抽象思维能力 ---难  java
public interface UserServer {
    int AGE=99;
     //接口的所有方法都是抽象的public abstract
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
