package com.study.test;

import com.study.classdemo.Car;

/**
 * com.study.test
 *
 * @Author: JF LI
 * @Date: 2021/8/18 21:24
 * @Version v1.0
 **/
public class CarTest {
    public static void main(String[] args){
        Car car = new Car();
        car.setName("宝马");
        car.setPrice(34.5d);
        System.out.println(car.getName() + "=========" + car.getPrice());
        Car car1 = new Car("保时捷",100.34d,"安徽");
        System.out.println(car1.getName() + "--------" + car1.getPrice());

        CarTools tool = new CarTools();
        Car car11 = tool.getCar();
        car11.toString(car11);
    }
}
