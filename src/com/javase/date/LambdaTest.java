package com.javase.date;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * com.javase.date
 *
 * @Author: JF LI
 * @Date: 2021/11/8 22:03
 * @Version v1.0
 **/
public class LambdaTest {
    public static void main(String[] args)
    {
        LambdaTest lambdaTest = new LambdaTest();

        MathOperation addition = Integer::sum;

        System.out.println("10 + 5: " + lambdaTest.operate(10,5,addition));

        //删除集合中的所有指定的数据
        ArrayList<String> testList = new ArrayList<>();
        testList.add("test");
        testList.add("");
        testList.add("com");
        testList.removeIf(e -> Objects.equals(e, "test"));
        System.out.println(Arrays.toString(new ArrayList[]{testList}));
        //流处理
        List<String> strList = Arrays.asList("a", "c", "b");
        strList.stream().sorted(String::compareToIgnoreCase).forEach(s -> System.out.println("=="+s));
        System.out.println("Fibonacci-30:"+Fibonacci(10));
    }
    interface MathOperation {
        int operation(int a, int b);
    }
    private  int operate(int a,int b,MathOperation mathOperation)
    {
        return mathOperation.operation(a,b);
    }
    public static int Fibonacci(int i) {
        if(i <= 0) {
            return 0;
        }
        if(i == 1 || i == 2) {
            return 1;
        }
        return Fibonacci(i -2) + Fibonacci(i-1);
    }
}
