package com.lc.struct;

public class forDemo04 {
    public static void main(String[] args) {
        int i;
        int j;
        for(i=1;i<10;i++){
//            System.out.println(i);
            for(j=1;j<=i;j++){
                System.out.print(i+"*"+j +"="+ i*j+"\t");
            }
            System.out.println();
        }

    }
}
