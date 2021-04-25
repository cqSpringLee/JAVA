package com.lc.array;

import java.util.Arrays;

public class arrayDemo06 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,9090,31321,543,21,3,23};
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        printArray(a);
        //数组排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //数组填充
        Arrays.fill(a,0);
        System.out.println(Arrays.toString(a));


    }
    public static void printArray(int[] array){
        for (int i=0;i< array.length;i++){
            if(i==0){
                System.out.print("[");
            }
            if(i== array.length-1){
                System.out.print(array[i]+"]");
            }else{
                System.out.print(array[i]+" ,");
            }
        }
    }
}
