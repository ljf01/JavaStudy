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
        //HashCode比较
        HashCode();
        CheckHashCode();
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

    public static void HashCode() {
        String str1 = "通话";
        String str2 = "重地";
        System.out.printf("str1:%d | str2:%d%n", str1.hashCode(), str2.hashCode());
        System.out.println("比较：" + false);
    }

    public static void CheckHashCode() {
        System.out.println("请任意输入：");
        Scanner sr = new Scanner(System.in);
        String str1 = sr.next();
        System.out.println("请再次输入一次：");
        Scanner sr1 = new Scanner(System.in);
        String str2 = sr1.next();
        System.out.printf("Str1:%d | Str2:%d%n", str1.hashCode(), str2.hashCode());
        System.out.println("比较：" + str1.equals(str2));
    }


}
