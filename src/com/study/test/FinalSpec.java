package com.study.test;

import com.study.classdemo.TestExtends.Student;

/**
 * com.study.test
 *
 * @Author: JF LI
 * @Date: 2021/8/28 11:44
 * @Version v1.0
 **/
public class FinalSpec {
    public static void main(String[] args) {
        //final关键字
        //final关键字是最终的意思，可以修饰方法、变量、类
        //final修饰的特点：
        //修饰变量：表明该变量是常量，不能再次被赋值;基本数据类型值不可修改，引用数据类型变量，地址值不可修改，但是可以通过set方法修改内部属性值
        //修饰的方法：表明该方法是最终方法，不能被重写
        //修饰类：表明该类是最终类，不能被继承

        final int MAX = 10;
        final int MAX_VALUE = 20;
        final Student stu = new Student();
        stu.setAge(MAX);
        stu.setScore(MAX_VALUE);
    }
}
