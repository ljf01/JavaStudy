package com.study.start;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** @author Jiafeng1.Li */
public class IteratorList {
    public static void main(String[] args) {
        iteratorTest();
    }

    public static void iteratorTest() {
        List<String> testList = new ArrayList<>();
        int num = 10;
        for (int i = 0; i < num; i++) {
            testList.add("Test:" + i);
        }
        Iterator<String> iter = testList.iterator();
        if (iter.hasNext()) {
            do {
                System.out.println("输出:" + iter.next());
            } while (iter.hasNext());
        }
    }
}
