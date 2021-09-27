package com.javawebstudy.Anno;

import org.w3c.dom.Element;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 *         * 元注解:用于描述注解的注解
 *         * @Target：描述注解能够作用的位置;
 *         * @Retention：描述注解能被保存的阶段;
 *         * @Documented：描述注解是否被抽取到api文档中
 *         * @Inherited：描述注解是否被子类继承
 */
@SuppressWarnings("all")
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})
//表示该MyAnnoDemo2注解只能作用在类、方法、变量上
public @interface MyAnnoDemo2 {

}
