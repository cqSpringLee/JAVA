package com.lc.struct;

public class forDemo02 {
    public static void main(String[] args) {
        int oddSum = 0;
        int evenSum =0;
        for(int i =0;i<100;i++){
            if(i%2 !=0){
                oddSum+=i;
            }else{
                evenSum+=i;
            }
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}
