package com.lc.scanner;
import java.util.Scanner;
public class Demo02 {
    public static void main(String[] args) {
        //键盘接收数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("nextLine: ");
        //判断是否还有输入

        if(scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("content: "+str);
        }
        scanner.close();
    }
}
