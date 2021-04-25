package com.lc.jichu;

public class Demo05 {
    public static void main(String[] args) {
        //int i = 129;
        //byte b = i;
        //内存溢出
//        byte b = (byte)i;
//        System.out.println(i);
//        System.out.println(b);
        System.out.println("====");
        byte i = 122;
        int b = i;
        float c = i;
        System.out.println(i);
        System.out.println(b);
        System.out.println(c);
        System.out.println("===");
        System.out.println((int)334.7);
        System.out.println((int)-334.1);
        System.out.println("===");
        char c1 = 'a';
        int d = c1 + 1;
        System.out.println(c1);
        System.out.println(d);
        System.out.println((char)d);

    }
}
