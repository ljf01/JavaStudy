package com.javawebstudy.AnnoTest;

import java.io.*;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 * 当主方法执行后，会自动去执行被检测的所有方法(加了Check注解的方法)，判断是否有异常，记录到文件中
 *
 * @author Jiafeng1.Li
 */
public class TestCheck {
    public static void main(String[] args) throws Exception {
        //1.创建计算机对象
        Calculator c = new Calculator();
        //2.获取字节码文件对象
        Class<? extends Calculator> cls = c.getClass();
        //3.获取所有方法
        Method[] methods = cls.getMethods();
        //4.判断方法上是否有Check注解
        int num = 0;
        Writer out;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                //5.有，执行
                try {
                    method.invoke(c);
                } catch (Exception ex) {
                    //6.捕获异常
                    num++;
                    bw.write(method.getName() + "方法出异常了");
                    bw.newLine();
                    bw.write("异常的名称：" + ex.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因：" + ex.getCause().getMessage());
                    bw.newLine();
                    bw.write("==============");
                }
            }
        }
        bw.write("本次测试一共出现" + num + "次异常");
        bw.flush();
        bw.close();
    }
}
