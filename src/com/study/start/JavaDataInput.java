package com.study.start;

import java.util.Scanner;

/**
 * @author lijf1
 */
public class JavaDataInput {
    public static void main(String[] args) {
        //人工录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入任一整数:");
        int age = sc.nextInt();
        System.out.println(age);

        System.out.println("请输入姓名:");
        String name = sc.next();
        String desc = sc.nextLine();
        System.out.println(name);
        System.out.println(desc);
    }
}
