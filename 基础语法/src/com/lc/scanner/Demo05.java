package com.lc.scanner;
import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int m = 0;
        while(scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m = m +1;
            sum = sum +x;
        }
        System.out.println(m);
        System.out.println(sum/m);
        scanner.close();
    }
}
