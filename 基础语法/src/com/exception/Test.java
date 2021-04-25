package com.exception;

public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try{
//            System.out.println(11/0);
            new Test().a();
        }catch (Throwable t){
            System.out.println("wrong");
        }finally {
            System.out.println("finally");
        }
    }
    public void a(){
        b();
    }
    public void b(){
        a();
    }
}
