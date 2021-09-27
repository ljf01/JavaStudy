package com.javawebstudy.Anno;

import java.util.Date;

/**
 * 注解
 *      1. @Override:检测被该注解标注的方式是否是继承自父类（接口）的;
 *      2. @Deprecated:该注解给标注的内容，表示已过时
 *      3. @SuppressWarnings:压制警告
 * @author Jiafeng1.Li
 */
@SuppressWarnings("all")
public class Anno {
    @Override
    public String toString(){
        return super.toString();
    }
    @Deprecated
    @SuppressWarnings("all")
    @MyAnnoDemo2
    //压制所有的警告
    public void show1(){
        //有缺陷
    }
    public void show2(){
        //替代Show1方法
    }
    @MyAnno(12)
    public void demo(){
        show1();
        Date date = new Date();
    }
}
