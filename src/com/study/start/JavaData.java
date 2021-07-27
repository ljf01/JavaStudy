package com.study.start;

import java.util.Scanner;

/**
 * @author lijf1
 */
public class JavaData {
    public static void main(String[] args) {
        System.out.println("请输入一个三位整数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = num % 10;
        int j = (num / 10) % 10;
        int m = (num / 10) / 10;
        System.out.println("个位数为:" + i);
        System.out.println("十位数为:" + j);
        System.out.println("百位数为:" + m);

        //数据操作
        dataOperation();
        //类型转换
        dataChange();
    }

    public static void dataOperation() {
        int num = 10;
        ++num;
        System.out.println(num);
    }

    public static void dataChange() {
        int num = (getNum(10) > getNum(10)) ? 1 : 2;
        System.out.println(num);
    }

    //TODO:功能测试
    public static int getNum(int param) {
        int num = 10;
        int num1 = 20;
        return param > 10 ? num : num1;
    }
}
