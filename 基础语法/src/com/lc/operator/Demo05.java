package com.lc.operator;
//逻辑运算符
public class Demo05 {
    public static void main(String[] args) {
        // and  or not
        boolean a = true;
        boolean b = false;
        System.out.printf("a && b"+ (a&&b)+"\n");
        System.out.printf("a || b"+ (a||b)+"\n");
        System.out.printf("! (a && b)"+ (!(a&&b)));

        //短路运算
        int c = 5;
        boolean d = (c<4)&&(c++<4);
        System.out.println(d);
        System.out.println(c);
    }

}
