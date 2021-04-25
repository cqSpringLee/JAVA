package com.lc.struct;

public class forDemo01 {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1;i<=100;i++){
            System.out.println(i);
            System.out.println("=");
            System.out.println(++a);
            System.out.println(a++);
        }

    }
}
