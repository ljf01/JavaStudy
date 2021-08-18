package com.study.classdemo;

/** @author Jiafeng1.Li */
public class Car {
    // 在同一个类中，定义了多个同名的方法，
    // 但每个方法具有不同的参数类型和参数个数，
    // 这些同名的方法，就构成了重载关系
    // 面向对象三大特征（封装，继承，多态）
    // 封装->隐藏实现的细节，仅对外暴露公共的访问方式
    // 将代码抽取到方法中，这是对功能的一种封装
    // 将属性抽取到类中，这是对数据的一种封装

    /*
    封装：标准的JavaBean类
    成员变量：使用private修饰
    构造方法：提供一个无参的构造方法，提供一个有参的构造方法
    成员方法：提供每一个成员变量对于的set()\get()方法
    * */

    private String name;
    private double price;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String address;

    public Car() {
    }

    public Car(String name, double price, String address) {
        this.name = name;
        this.price = price;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void toString (Car car){
        System.out.println(car.getName() + "=" + car.getPrice() + "=" + car.getAddress());
    }
}
