package com.study.start;

import com.study.test.AbstractClass;
import com.study.test.Salary;

/**
 * @author Jiafeng1.Li
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Salary s = new Salary("Mohd", "AN, UP", 3, 3600.00);
        AbstractClass e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
        System.out.println(s.getAddress());
    }
}
