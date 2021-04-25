package com.lc.jichu;

public class Demo08 {
    //类变量 static
    static double salary = 2500;
    //main 方法
    //实例变量： 变量
    String name;
    int age;
    long num;
    float xi;
    public static void main(String[] args) {
        //局部变量：必须声明和初始化
        int i = 10;
        System.out.println(i);

        //变量类型
        Demo08 demo08 = new Demo08();
        System.out.println(demo08.age);
        System.out.println(demo08.name);
        System.out.println(demo08.num);
        System.out.println(demo08.xi);
        //类变量 static
        System.out.println(salary);



    }
    //其他方法
    public void add(){

    }
}
