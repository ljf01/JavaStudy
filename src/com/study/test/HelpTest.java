package com.study.test;

import com.study.classdemo.Employee;

/**
 * com.study.test
 *
 * @Author: JF LI
 * @Date: 2021/9/6 21:32
 * @Version v1.0
 **/
public class HelpTest {
    public static void main(String[] args) throws Exception {
        //1.Class.forName("全类名")

        Class<?> cls1 = Class.forName("com.study.classdemo.Employee");
        System.out.println(cls1);
        //2.类名.class
        Class<?> cls2 = Employee.class;
        System.out.println(cls2);
        //3.对象.getClass()
        Employee e = new Employee();
        Class<? extends Employee> cls3 = e.getClass();
        System.out.println(cls3);
    }
}
