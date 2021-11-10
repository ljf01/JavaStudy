package com.javase.date;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author Jiafeng1.Li
 * @date 2021/11/10
 */
public class LambdaFunction {
    public static void main(String[] args) {
        LambdaFunction test = new LambdaFunction();
        //实现四则运算
        System.out.println(test.compute(4, 2, Integer::sum));
        System.out.println(test.compute(4, 2, (v1, v2) -> v1 - v2));
        System.out.println(test.compute(1, 2, (v1, v2) -> v1 * v2));
        System.out.println(test.compute(3, 2, (v1, v2) -> v1 / v2));
        System.out.println(test.calcute(3, 4, Integer::sum, v -> v * v));
    }

    public int compute(int num1, int num2, BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(num1, num2);
    }

    public int calcute(int num1, int num2, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function) {
        //调用addThen首先对接收的两个参数进行biFunction的apply，然后在进行function的apply
        return biFunction.andThen(function).apply(num1, num2);
    }

    public static void repeat(int n,Runnable action)
    {
        for (int i = 0;i<n;i++) {
            action.run();
        }
    }
}
