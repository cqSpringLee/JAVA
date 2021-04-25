package com.exception;

public class Test2 {
    public static void main(String[] args) {
        int a = 1;
        int b =2;
        new Test2().test(1,0);

    }
    public void test(int a,int b){
        if(b==0){
            throw new ArithmeticException();
        }
        System.out.println(a/b);
    }
}
