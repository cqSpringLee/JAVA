package com.lc.array;

public class arrayDemo02 {
    public static void main(String[] args) {
        //静态初始化
        int[] a = {1,2,3,4,5};
        System.out.println(a[0]);

        //动态初始化
        int[] a1 = new int[2];
        a1[0] = 1;
        a1[1] = 2;
        System.out.println(a1[1]);

    }
}
