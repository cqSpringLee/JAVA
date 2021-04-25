package com.lc.struct;
import java.util.Scanner;
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please intput ");
        int score =scanner.nextInt();

        if (score>60){
            System.out.println("ok");
        }else{
            System.out.println("no ok");
        }
    }
}
