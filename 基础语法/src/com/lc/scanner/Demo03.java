package com.lc.scanner;
import java.util.Scanner;
public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        float f = 0.0f;
        System.out.println("please input int!");

        if(scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println("int "+ i);
        }else{
            System.out.println("not int");
        }
        if(scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println("float "+ f);
        }else{
            System.out.println("not float");
        }

    }
}
