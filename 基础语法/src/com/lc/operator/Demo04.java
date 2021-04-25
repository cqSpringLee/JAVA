package com.lc.operator;

public class Demo04 {
    public static void main(String[] args) {
        //++ --  一元运算符
        int a = 3;
        int b = a++;
        int c = ++a;

        System.out.println(a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(b);
        System.out.println(c);
        System.out.println(c);
        System.out.println(Math.pow(3,50));
    }
}
