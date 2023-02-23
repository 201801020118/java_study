package com.hspedu.modifler;

public class B {
    //在同一个包是否可以访问不同修饰符的变量
    public void say() {
        A a = new A();
        //在同一个包下,可以访问 public,protected,和默认,不能访问private
        System.out.println("n1=" + a.n1 + "n2=" + a.n2 + "n3=" + a.n3);
        a.m1();
        a.m2();
        a.m3();
    }
}
