package com.lc.struct;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input :");
        String s = scanner.nextLine();
        if(s.equals("xixi")){
            System.out.println(s);
        }
        System.out.println("end");
        scanner.close();

    }
}
