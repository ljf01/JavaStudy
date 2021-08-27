package com.study.test;

import java.util.Scanner;

/** com.study.test @Author: JF LI @Date: 2021/8/16 22:23 @Version v1.0 */
public class TestDemo {
    public static void main(String[] args) {

        System.out.println("Test");
        // 循环跳出外循环
        int num = 3;
        test: // 标号
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 1) {
                    break test;
                }
                System.out.println(i + "====" + j);
            }
        }
        for (; true; ) {
            System.out.println("请输入一个0-100的整数：");
            Scanner sc = new Scanner(System.in);
            int input = -1;
            try {
                input = sc.nextInt();
            } catch (Exception ex) {
                System.out.println("您的输入有误，请重新输入");
            }
            if (0 <= input && input <= 100) {
                System.out.println("您的输入正确！！！");
                break;
            }
        }
    }
}
