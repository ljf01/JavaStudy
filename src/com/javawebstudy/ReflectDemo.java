package com.javawebstudy;

import com.javawebstudy.classes.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Jiafeng1.Li
 */
public class ReflectDemo{
    public static void main(String[] args) {
        //1.获取Person的成员变量
        Class<Person> personClass = Person.class;
        //2.Field[] getFields获取所有的public修饰的成员变量
        Field[] fields = personClass.getFields();
        for(Field field : fields){
            System.out.println(field);
        }
        System.out.println("==========");
        try {
            Field a = personClass.getField("name");
            //获取成员变量name的值
            Person p = new Person();
            Object o =  a.get(p);
            System.out.println(o);
            a.set(p,"张三");
            System.out.println(p);
            System.out.println("=============");
            //获取所有的成员变量不考虑访问权限
            Field[] declareFields = personClass.getDeclaredFields();
            for (Field f : declareFields) {
                System.out.println(f);
            }
            Field d = personClass.getDeclaredField("address");
            //忽略访问权限修饰符的安全检查
            d.setAccessible(true);
            //暴力反射
            Object j = d.get(p);
            System.out.println(j);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        //++++++++++
        try {
            Method mtd = personClass.getMethod("eat");
            Person per = new Person();
            mtd.invoke(per);
            Method mtds = personClass.getMethod("eat",String.class);
            mtds.invoke(per,"香蕉");
            System.out.println("==========");
            Method[] methods = personClass.getMethods();
            for(Method method : methods){
                System.out.println(method);

                //暴力反射：method.setAccessible(true)

                System.out.println("===:"+method.getName());
            }
            //获取类名
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
