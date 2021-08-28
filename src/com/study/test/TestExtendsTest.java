package com.study.test;

import com.study.classdemo.TestExtends.Student;

/**
 * com.study.test
 *
 * @Author: JF LI
 * @Date: 2021/8/28 11:29
 * @Version v1.0
 **/
public class TestExtendsTest {
    public static void main(String[] args) {
        Student stu = new Student("法外狂徒--张三", 23, 88);
        System.out.println
                (stu.getName() + "今年" + stu.getAge() + "岁,本次的得分是" + stu.getScore());
    }
}
