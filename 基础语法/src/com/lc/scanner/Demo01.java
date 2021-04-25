package com.lc.scanner;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫描器对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("next to sti");
        //判断用户有没有输入字符串
        if (scanner.hasNext()) {
            //使用next方式接收
            String str = scanner.next(); //等待用户输入
            System.out.println("content " + str);
        }
        scanner.close();
    }
}
