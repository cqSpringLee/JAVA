package com.lc.struct;

public class breakDemo01 {
    public static void main(String[] args) {
        int i=0;
        while(i<100){
            i++;
//            System.out.println(i);
            if(i%10==0){
                System.out.println(i);
                continue;

            }
        }
    }
}
