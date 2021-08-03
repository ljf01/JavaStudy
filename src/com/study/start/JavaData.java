package com.study.start;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * @author lijf1
 */
public class JavaData {
    public static void main(String[] args) {
        out.println("请输入一个三位整数:");
        Scanner sc = new Scanner(in);
        int num = sc.nextInt();
        int i = num % 10;
        int j = (num / 10) % 10;
        int m = (num / 10) / 10;
        out.println("个位数为:" + i);
        out.println("十位数为:" + j);
        out.println("百位数为:" + m);
        //数据操作
        dataOperation();
        //类型转换
        //HashCode比较
        hashCodeTest();
        checkHashCode();
        out.println();
    }

    public static void dataOperation() {
        int num = 10;
        ++num;
        out.println(num);
    }
    /**
     *
     */
    public static void hashCodeTest() {
        String str1 = "通话";
        String str2 = "重地";
        out.printf("str1:%d | str2:%d%n", str1.hashCode(), str2.hashCode());
        out.println("比较：" + false);
    }

    public static void checkHashCode() {
        out.println("请任意输入：");
        Scanner sr = new Scanner(in);
        String str1 = sr.next();
        out.println("请再次输入一次：");
        Scanner sr1 = new Scanner(in);
        String str2 = sr1.next();
        out.printf("Str1:%d | Str2:%d%n", str1.hashCode(), str2.hashCode());
        out.println("比较：" + str1.equals(str2));
    }


}
