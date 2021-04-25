package com.oop.demo09;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Application {

    public static void main(String[] args) {
//        Student s1=new Student();
//        Object object=new Student();
        Person obj=new Student();
        Student obj1=(Student) obj;
        obj1.go();
        //equals
        ((Student)obj).go();




//        System.out.println(object instanceof Student);
//        System.out.println(object instanceof Person);
//        System.out.println(object instanceof Object);
//        System.out.println(object instanceof Teacher);
//        System.out.println(object instanceof String);

    }

}
