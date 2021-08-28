package com.study.classdemo.override;

/**
 * com.study.classdemo.override
 *
 * @Author: JF LI
 * @Date: 2021/8/28 10:51
 * @Version v1.0
 **/
public class IPearV2 extends IPearV1 {
    @Override
    public void smallBlack() {
        super.smallBlack();
        System.out.println("说中文");
    }
}
