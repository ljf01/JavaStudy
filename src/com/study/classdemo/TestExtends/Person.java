package com.study.classdemo.TestExtends;

/**
 * com.study.classdemo.TestExtends
 *
 * @Author: JF LI
 * @Date: 2021/8/28 11:26
 * @Version v1.0
 **/
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
