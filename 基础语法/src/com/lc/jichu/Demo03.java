package com.lc.jichu;

public class Demo03 {
    public static void main(String[] args) {
        //整数拓展
        int i = 10;
        int i2 = 010;
        int i3 = 0x10;
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("======");
        //浮点数银行表示
        //最好完全使用浮点数比较
        //最好完全使用浮点数比较
        //最好完全使用浮点数比较

        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f==d);
        System.out.println(f);
        System.out.println(d);
        System.out.println("======");
        float d1=1234567898232423f;
        float d2=d1+1;
        System.out.println(d1==d2);

        //字符拓展
        char c1 = 'a';
        char c2 = '中';
        char c3 = 'A';
        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println(c2);
        System.out.println((int)c2);
        System.out.println(c3);
        System.out.println((int)c3);
        //所有的字符本质还是数字。有一张编码表

        //转义字符
        System.out.println("hello \t \n world");
        System.out.println("====");
        String original;
//        String sa = new String(original:"he");
//        String sb = new String(original:"he");
//        System.out.println(sa ==sb);
        String sc = "he";
        String sd = "he";
        System.out.println(sc == sd);

        //布尔值拓展
        boolean flag = true;
        if (flag==true){
            System.out.println("1");
        }

    }
}
