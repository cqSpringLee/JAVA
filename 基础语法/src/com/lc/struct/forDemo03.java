package com.lc.struct;

public class forDemo03 {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            if(i%5==0){
                System.out.print(i+"\t");
//                System.out.println(i+"\t");
            }
            if(i%(5*3)==0){
                System.out.println();
//                System.out.print("\n");
            }
        }
    }
}
