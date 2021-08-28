package com.study.classdemo;

/**
 * com.study.classdemo
 *
 * @Author: JF LI
 * @Date: 2021/8/28 10:22
 * @Version v1.0
 **/
public class Employee {
    //继承的好处和弊端
    //增加了复用，但是造成了高耦合
    //什么时候使用继承：当类与类之间存在共性，并且产生了is a （学生是人的一种，老师是人的一种）的关系，就可以考虑使用继承，来优化代码
    //继承的特定
    //Java中只支持单继承，不支持多继承，但支持多层继承，多层继承，A继承B，B继承C

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
