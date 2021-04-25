package com.lc.array;

import java.util.Arrays;

public class arrayDemo07 {
    public static void main(String[] args) {
        int[] array = {1,2,2,34,6,7};
        sort(array);
        System.out.println(Arrays.toString(array));

    }
    public static int[] sort(int[] array){
        //外层循环
        for (int i=0;i< array.length-1;i++){
            //内层循环
            for (int j=0;j< array.length-1-i;j++){
                int temp=0;
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;

    }
}
