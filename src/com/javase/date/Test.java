package com.javase.date;

/**
 * @author Jiafeng1.Li
 */
public class Test {
    public  static void main(String[] args)
    {
        Employee emp = new Employee(1,"张三",100);
        System.out.println(emp.toString());
        test(emp);
        System.out.println(emp.toString());
        int x = 100;
        System.out.println(x);
        test1(100);
        System.out.println(x);
    }
    public static void test(Employee e)
    {
        e.change(200);
    }
    public static void test1(int x)
    {
        x += 100;
    }
}
