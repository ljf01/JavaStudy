package com.study.test;

/**
 * com.study.test
 *
 * @Author: JF LI
 * @Date: 2021/8/28 13:34
 * @Version v1.0
 **/
public class jiekouClass {
    /**
     * 接口体现出来的规则
     * 接口使用interface定义，public interface xxx{}
     * 接口不能实例化
     * 接口和类之间是实现关系，通过implements关键字表示 public class xxx implements XXX{}
     * 接口的子类即实现类，要么重写接口中的所有抽象方法，要么设定成抽象类
     * 接口的实现类可以实现多个接口
     * <p>
     * 接口中的成员变量:只能是常量默认是final，public访问权限，以及static
     * 接口中没有构造方法，接口的实现类super()访问的是Object的构造方法
     * 成员方法：接口的成员方法只能是抽象方法，系统会默认加入public abstract
     * 子类在重写父类方法时，访问权限必须大于等于父类的权限
     * <p>
     * 子类可以继承一个类，再实现多个接口，实现的接口如果和父类中存在方法重复，则不需要重复实现
     * <p>
     * 类与接口之间可以继承
     * 类和类的关系：继承关系，只能单继承，但是可以多层继承
     * 类和接口的关系:实现关系，可以单实现，也可以多实现，还可以在继承一个类的同时实现多个接口
     * 接口与接口的关系：继承关系，可以单继承可以多继承
     */


    public static void main(String[] args) {
        jiekouImpl jiekou = new jiekouImpl();
        jiekou.test();
        jiekou.study();
        new ZiClass().study();
        new ZiClass().test();
        new ZiClass().method();

    }
}

class ZiClass extends FuClass implements jiekou, jiekouA, jiekouC {

    @Override
    public void test() {
        System.out.println("11");
    }

    @Override
    public void study() {
        System.out.println("22");
    }
}

class FuClass {
    String name;

    public void method() {
        System.out.println("44");
    }
}

