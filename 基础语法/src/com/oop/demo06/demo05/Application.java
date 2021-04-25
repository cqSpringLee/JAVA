package com.oop.demo06.demo05;

public class Application {
    public static void main(String[] args) {
        //一个对象的实例类型是确定的
        //new Students()
        //new Person();
        //可以指向的应用类型就不确定了，父类的引用指向子类。
        Student s1=new Student();
        Person s2=new Student();
        Object s3= new Student();
//        s1.test("xixi");
//        s1.test01("h");
        
//        print();
//        this.print();
//        super.print();

//        s1.say();

//        System.out.println(s1.getMoney());

    }
}
