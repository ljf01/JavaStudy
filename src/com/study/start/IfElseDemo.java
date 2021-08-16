package com.study.start;

import java.util.Scanner;

/** @author Jiafeng1.Li */
public class IfElseDemo {
    public static final int NUM = 95;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        if (sc.nextInt() >= NUM) {
            System.out.println("非常棒");
        } else if (sc.nextInt() < NUM) {
            System.out.println("一般");
        } else {
            System.out.println("输入有误");
        }
    }
}
