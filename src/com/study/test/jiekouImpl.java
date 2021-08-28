package com.study.test;

/**
 * com.study.test
 *
 * @Author: JF LI
 * @Date: 2021/8/28 13:43
 * @Version v1.0
 **/
public class jiekouImpl implements jiekou, jiekouA {
    @Override
    public void test() {
        System.out.println("我是实现类:" + num);
    }

    @Override
    public void study() {
        System.out.println("我是实现了接口A");
    }
}
