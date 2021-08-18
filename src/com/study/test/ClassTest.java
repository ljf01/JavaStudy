package com.study.test;

import com.study.classdemo.Student;

/** @author Jiafeng1.Li */
public class ClassTest {

    // private :只能在同一个类中访问;
    // （default）：同一个类中，同一个包下访问;
    // protected:;
    // public :同一个包，同一个类，不同包;

    public static void main(String[] args) {
        Student stu = new Student();

        stu.name = "李四";
        /*对象在内存中的地址值*/
        System.out.println(stu);
        stu.name();
        stu.age();
        stu.address();
        // 就近原则，在局部变量和成员变量重名时，采用就近原则
        stu.getName("我是张三");
        /*
            this代表当前类的对象引用（地址）
            哪一个对象调用的this，this就代表哪一个对象，用于区分局部变量和成员变量的重名问题
        * */
        stu.method();
        Student stu1 = new Student();
        System.out.println(stu1);
        stu1.method();
    }
}
