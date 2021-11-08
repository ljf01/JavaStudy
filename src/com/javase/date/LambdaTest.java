package com.javase.date;

import java.util.regex.Matcher;

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
        MathOperation subtraction = (a,b) -> a-b;
        MathOperation multiplication = (int a,int b) -> {return a * b;};
        MathOperation division = (int a,int b) -> a / b;
        System.out.println("10 + 5: " + lambdaTest.operate(10,5,addition));
    }
    interface MathOperation {
        int operation(int a, int b);
    }
    private  int operate(int a,int b,MathOperation mathOperation)
    {
        return mathOperation.operation(a,b);
    }
}
