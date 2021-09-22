package com.javawebstudy;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author Jiafeng1.Li
 */
public class ReflectTest {
    public static void main(String[] args){
    //1.加载配置文件
    //1.1创建Properties对象

        Properties pro = new Properties();
        //1.2加载配置文件，转换为一个集合
        //1.2.1获取class目录下的配置文件
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("pro.properties");
        try {
            pro.load(inputStream);
            //2.获取配置文件中定义的数据
            String className = pro.getProperty("className");
            String methodName = pro.getProperty("methodName");
            //3.加载该类进内存
            Class<?> cla = Class.forName(className);
            //4.创建对象
            Object obj = cla.newInstance();
            //5.获取方法对象
            Method method = cla.getMethod(methodName);
            //6.执行方法
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
