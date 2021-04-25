package com.lc.struct;

public class forDemo05 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        for (int x:numbers){
            System.out.println(x);
        }
        for (int i=0;i<5;i++)
            System.out.println(numbers[i]);
    }
}
