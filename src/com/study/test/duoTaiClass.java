package com.study.test;

/**
 * com.study.test
 *
 * @Author: JF LI
 * @Date: 2021/8/28 14:22
 * @Version v1.0
 **/
public class duoTaiClass {
    /**
     * 多态：同一个对象，在不同时刻表现出来的不同形态
     * 多态的前提和体现：
     * 1.有继承/实现关系
     * 2.有方法重写
     * 3.有父类引用指向子类对象
     * <p>
     * 多态中成员访问特点：
     * 成员变量：编译看左边父类，运行看左边父类
     * 成员方法：编译看左边父类，运行看右边子类
     * <p>
     * 多态的好处和弊端：
     * 提高了程序的扩展性，定义方法时，使用父类型作为参数，该方法就可以接收这父类的任意子类对象
     * 多态的弊端：不能使用子类的特有功能
     * <p>
     * 多态中的转型
     * 向上转型：从子到父，父类引用指向子类对象
     * 向下转型：从父到子，父类引用转为子类对象
     */

    public static void main(String[] args) {
        EmployeePer e = new CoderPer();
        System.out.println(e.num);
        //CoderPer c = new CoderPer();
        e.work();

        duoTaiClass doClass = new duoTaiClass();
        doClass.userAnimal(new Dog());
        doClass.userAnimal(new Cat());
    }

    //多态调用
    public void userAnimal(Animal animal) {
        if (animal instanceof Dog) {
            Dog d = (Dog) animal;
            d.spec();
        } else if (animal instanceof Cat) {
            Cat c = (Cat) animal;
            c.spec();
        }
        animal.eat();
    }
}

class EmployeePer {
    int num = 10;

    public void work() {
        System.out.println("工作");
    }
}

class CoderPer extends EmployeePer {
    int num = 20;

    @Override
    public void work() {
        System.out.println("程序员工作");
    }
}

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void spec() {
        System.out.println("狗看家");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void spec() {
        System.out.println("猫上树");
    }
}
