package com.study.classdemo;

/** @author Jiafeng1.Li */
public class Student {
    public String name;
    public int age;
    public String address;

    public void name() {
        System.out.println("学生需要有姓名");
    }

    public void age() {
        System.out.println("学生需要有姓名");
    }

    public void address() {
        System.out.println("学生需要有地址");
    }

    public void getName(String name) {
        System.out.println(name);
        // 打印成员变量
        System.out.println(this.name);
    }

    public void method() {
        System.out.println("method方法的this:" + this);
    }
}
