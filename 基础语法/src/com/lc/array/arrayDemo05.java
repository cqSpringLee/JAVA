package com.lc.array;

public class arrayDemo05 {
    public static void main(String[] args) {
        int[][] array={{1,2},{2,3},{3,4}};
        /*
        1,2   array[0]
        2,3   array[1]
        3,4   array[2]
         */
//        System.out.println(array[0][1]);
//        System.out.println(array.length);
//        System.out.println(array[0].length);
        for (int i=0;i< array.length;i++){
            for(int j=0;j<array[i].length;j++)
                System.out.println(array[i][j]);
        }
    }
}
