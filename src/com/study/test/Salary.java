package com.study.test;

/**
 * @author Jiafeng1.Li
 */
public class Salary extends AbstractClass {
    private double salary;

    public Salary(String name, String address, int number, double
            salary) {
        super(name, address, number);
        setSalary(salary);
    }

    @Override
    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName()
                + " with salary " + salary);
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    @Override
    public String getAddress() {
        return "This is an Abstract";
    }
}
