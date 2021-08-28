package com.study.test;

/**
 * com.study.test
 *
 * @Author: JF LI
 * @Date: 2021/8/28 13:15
 * @Version v1.0
 **/
public class ChouXiangClass {
    /**
     * 抽象类子类需要重写方法
     * 抽象类：把相似的部分抽取到一个父类中(共性行为向上抽取)
     * 当行为被抽取到父类中之后，发现这个行为在父类中描述不清了
     * 且该行为还是子类必须要做到的事，就将其定义为抽象方法
     * 抽象方法需要存活在抽象类当中
     * SPEC:抽象类就是一个特殊的父类，该父类中可以定义抽象方法
     */
    public static void main(String[] args) {

    }
}

/**
 * 抽象类不允许创建对象，一旦允许创建对象，就可以调用内部没有方法体的抽象方法了
 * 抽象类存在构造方法
 * 抽象类可以不存在抽象方法，但是存在抽象方法的一定为抽象类，抽象类中可以定义常规的方法
 * 抽象类的子类要么重写所有的抽象方法；要么不重写方法则需要将自己也变成一个抽象类（不建议使用）
 */

abstract class BaseEmployee {
    public abstract void work();
}

class Manager extends BaseEmployee {
    @Override
    public void work() {
        System.out.println("管理");
    }
}

class Coder extends BaseEmployee {
    @Override
    public void work() {
        System.out.println("写代码");
    }
}
