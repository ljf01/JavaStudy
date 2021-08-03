package com.study.start;

/**
 * @author Jiafeng1.Li
 */
public class FinalClass {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.say();
        t.eat();
    }
}
class Person {
    public final void say() {
        System.out.println("说....");
    }
}
class Teacher extends Person {
    public void eat() {
        System.out.println("老师在大口大口的吃...");
    }
}
