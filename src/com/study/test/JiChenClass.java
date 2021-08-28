package com.study.test;

/**
 * com.study.test
 *
 * @Author: JF LI
 * @Date: 2021/8/28 10:35
 * @Version v1.0
 **/
public class JiChenClass {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
        z.method();
    }
}

//继承的好处和弊端
//增加了复用，但是造成了高耦合
//什么时候使用继承：当类与类之间存在共性，并且产生了is a （学生是人的一种，老师是人的一种）的关系，就可以考虑使用继承，来优化代码
//继承的特点：
//Java中只支持单继承，不支持多继承，但支持多层继承，多层继承，A继承B，B继承C
//子类无法继承父类的构造方法，构造方法的方法名要与类名一致

//在子类初始化的时候，会先进行父类初始化；子类初始化时可能会使用到父类的数据；父类的初始化就是调用父类的构造方法；（子类构造方法默认会调用super()方法）
//父类也存在super(),没有手动设置继承，会默认继承了Object类（Java继承体系中的最顶层父类）

//继承中构造方法的访问特点:（父类没有无参构造方法，只有带参构造方法）
//子类通过super（）手动调用父类的带参构造方法
//子类通过this去调用本类的其他构造方法，本类其他构造方法再通过super去手动调用父类的带参的构造方法
//this()和super()在使用时必须放在构造方法的第一行，且二者不能共存

//this和super
//this代表本类对象的引用
//super代表父类存储空间的标识（可以理解为父类对象引用）


class Fu {
    int num = 10;

    public void method() {
        System.out.println("父类中的method方法");
    }
}

class Zi extends Fu {
    int num = 20;

    @Override
    public void method() {
        System.out.println("子类的METHOD方法");
    }

    public void show() {
        int num = 30;
        System.out.println(num);
        //打印30
        System.out.println(this.num);
        //打印20,外部成员变量值
        System.out.println(super.num);
        //打印父类成员变量值
    }
}
