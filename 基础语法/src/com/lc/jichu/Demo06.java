package com.lc.jichu;

public class Demo06 {
    public static void main(String[] args) {
        int money = 10_0000_0000;
        int years = 20;
        int total = money*years;
        System.out.println(total);
        System.out.println("====");
        long total2 = money*((long)years);
        System.out.println(total2);
    }
}
