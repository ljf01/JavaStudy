package com.javawebstudy;

import com.javawebstudy.classes.Person;

import java.lang.reflect.Constructor;

/**
 * @author Jiafeng1.Li
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        //获取person的class对象
        Class<Person> person = Person.class;
        Constructor<Person> constructor = person.getConstructor(String.class,String.class,int.class);
        System.out.println(constructor);
        //创建对象
        Object per = constructor.newInstance("李四","合肥",55);
        System.out.println(per);
    }
}
