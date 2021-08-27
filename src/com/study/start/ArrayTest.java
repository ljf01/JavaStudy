package com.study.start;

/** @author Jiafeng1.Li */
public class ArrayTest {
    public static void main(String[] args) {
        int[] array = {10, 12, 14, 15, 16, 18, 19, 33, 55, 77, 88};
        // int[] arr = new int[] {33, 66, 77, 88, 4, 55, 99, 32};
        // int[] array1 = new int[10];
        int num = 2;
        for (int i = 0; i < array.length / num; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "====" + array[i]);
        }

        int[][] arrayList =
                new int[][] {
                    {11, 22},
                    {22, 33}
                };
        System.out.println(arrayList[0][1]);
        for (int i = 0; i < arrayList.length; i++) {
            for (int j = 0; j < arrayList[i].length; j++) {
                System.out.println(i + "=" + j + "==" + arrayList[i][j]);
            }
        }
    }
}
