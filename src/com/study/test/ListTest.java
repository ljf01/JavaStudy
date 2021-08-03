package com.study.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jiafeng1.Li
 */
public class ListTest {

    public void listTest() {
        List<String> person = new ArrayList<>();
        person.add("jackie");
        //索引为0 //.add(e)
        person.add("peter");
        //索引为1
        person.add("annie");
        //索引为2
        person.add("martin");
        //索引为3
        person.add("marry");
        //索引为4

        person.remove(3);
        //.remove(index)
        person.remove("marry");
        //.remove(Object o)

        String per;
        per = person.get(1);
        System.out.println("集合中的第二个元素：" + per);

        //.get(index)
        for (int i = 0; i < person.size(); i++) {
            System.out.println("第" + i + "个" + person.get(i));
        }
    }

    public static void main(String[] args) {
        new ListTest().listTest();
    }
}
