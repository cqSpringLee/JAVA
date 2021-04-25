package com.lc.struct;
import java.util.Scanner;
public class switchDemo01 {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade){
            case 'A':
                System.out.println("good");
                break;
            case 'B':
                System.out.println("god");
                break;
            case 'C':
                System.out.println("gd");
                break;
            default:
                System.out.printf("bye");
        }
    }
}
