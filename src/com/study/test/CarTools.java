package com.study.test;

import com.study.classdemo.Car;

import java.util.Scanner;

/**
 * com.study.test
 *
 * @Author: JF LI
 * @Date: 2021/8/18 21:55
 * @Version v1.0
 **/
public class CarTools {
    public Car getCar(){
        Car car = new Car();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入车辆名称:");
        car.setName(sc.next());
        System.out.println("请输入车辆价格:");
        car.setPrice(sc.nextDouble());
        System.out.println("请输入车辆购买地:");
        car.setAddress(sc.next());
        return car;
    }
}
