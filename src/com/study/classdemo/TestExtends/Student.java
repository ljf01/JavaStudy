package com.study.classdemo.TestExtends;

/**
 * com.study.classdemo.TestExtends
 *
 * @Author: JF LI
 * @Date: 2021/8/28 11:27
 * @Version v1.0
 **/
public class Student extends Person {
    private int score;

    public Student() {
    }

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
