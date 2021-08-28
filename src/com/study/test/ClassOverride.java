package com.study.test;

import com.study.classdemo.override.IPearV2;

/**
 * com.study.test
 *
 * @Author: JF LI
 * @Date: 2021/8/28 10:48
 * @Version v1.0
 * @deprecated 方法重写
 **/
public class ClassOverride {
    public static void main(String[] args) {
        IPearV2 v2 = new IPearV2();
        v2.call("法外狂徒--张三");
        v2.smallBlack();
    }
}
