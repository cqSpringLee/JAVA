package com.exception;

public class demo01 {
    public static void main(String[] args) {
        new demo01().a();
    }
    public void a(){
        b();
    }
    public void b(){
        a();
    }
}
