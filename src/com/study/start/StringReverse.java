package com.study.start;

import java.util.Random;
import java.util.Stack;

public class StringReverse {
    public static void main(String[] args) {
        // 实例一个长度为100000的字符串
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(random.nextInt(10));
        }
        String test = sb.toString();

        // 方法1
        long start1 = System.nanoTime();
        String reverse1 = reverse1(test);
        System.out.println("reverse1 time = " + (System.nanoTime() - start1));
        // 方法2
        long start2 = System.nanoTime();
        String reverse2 = reverse2(test);
        System.out.println("reverse2 time = " + (System.nanoTime() - start2));
        // 方法3
        long start3 = System.nanoTime();
        String reverse3 = reverse3(test);
        System.out.println("reverse3 time = " + (System.nanoTime() - start3));
        // 方法4
        long start4 = System.nanoTime();
        String reverse4 = reverse4(test);
        System.out.println("reverse4 time = " + (System.nanoTime() - start4));
        // 方法5
        long start5 = System.nanoTime();
        String reverse5 = reverse5(test);
        System.out.println("reverse5 time = " + (System.nanoTime() - start5));

        System.out.println(test);

        System.out.println(reverse1);
        System.out.println(reverse2);
        System.out.println(reverse3);
        System.out.println(reverse4);
        System.out.println(reverse5);
    }

    private static String reverse1(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuffer(str).reverse().toString();
    }

    private static String reverse2(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    private static String reverse3(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder result = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            result.append(chars[i]);
        }
        return result.toString();
    }

    private static String reverse4(String str) {
        if (str == null) {
            return null;
        }
        int stackSize = str.length();
        Stack<Character> theStack = new Stack<>();
        for (int i = 0; i < stackSize; i++) {
            theStack.push(str.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            result.append(ch);
        }
        return result.toString();
    }

    private static String reverse5(String str) {
        if (str == null) {
            return null;
        }
        char[] chars = str.toCharArray();
        int n = chars.length - 1;
        for (int i = 0; i <= chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[n - i];
            chars[n - i] = temp;
        }
        return new String(chars);
    }
}
