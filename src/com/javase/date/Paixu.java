package com.javase.date;

import java.util.Arrays;

/**
 * @author Jiafeng1.Li
 */
public class Paixu {
    public static void main(String[] args) {
        int[] dataArray = {120, 110, 100, 90, 80, 70, 45};
        int[] dataArray1 = dataArray.clone();
        int [] dataArray2 =  dataArray.clone();
        bubbleSort(dataArray);
        System.out.println("=============");
        selectSort(dataArray1);
        System.out.println("*************");
        insertionSort(dataArray2);
    }

    /**
     * 冒泡排序
     */
    public static void bubbleSort(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length - i - 1; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    int temp = arrays[j + 1];
                    arrays[j + 1] = arrays[j];
                    arrays[j] = temp;
                }
                System.out.println("第" + i + 1 + "组: " + "第" + j + 1 + "次: " + Arrays.toString(arrays));
            }
        }
    }

    /**
     * 选择排序
     */
    public static void selectSort(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            int minNum = i;
            for (int j = i + 1; j < arrays.length - i; j++) {
                if (arrays[j] < arrays[minNum]) {
                    minNum = j;
                }
            }
            int temp = arrays[i];
            arrays[i] = arrays[minNum];
            arrays[minNum] = temp;
            System.out.println("第" + i + 1 + "组:" + Arrays.toString(arrays));
        }
    }

    /**
     * 插入排序
     */
    public static void insertionSort(int[] arrays) {
        int i, j, temp;
        for (i = 1; i < arrays.length; i++) {
            temp = arrays[i];
            for (j = i - 1; j >= 0; j--) {
                if (arrays[j] > temp) {
                    arrays[j + 1] = arrays[j];
                    arrays[j] = temp;
                }
                System.out.println("第" + i + "组:" + Arrays.toString(arrays));
            }
        }
    }
}
