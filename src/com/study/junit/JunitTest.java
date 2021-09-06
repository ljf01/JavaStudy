package com.study.junit;

/** @author Jiafeng1.Li */
public class JunitTest {

    public int add(int a, int b) {
        return a + b;
    }

    public void sub(int a, int b) {
        System.out.println(a - b);
    }

    /**
     * Junit使用： 1. 定义一个测试类 建议：测试类名：被测试类名加Test 包名：xxx.xxx.xx.test 2.定义测试方法：可以独立运行 建议：方法名，testXxx
     * 返回值：void 参数列表:空参 3.给方法加@Test注解 4.导入Junit依赖
     * 判定结果：红色失败，绿色成功，一般使用断言操作处理结果 @Before注解用于资源申请 @After注解用于资源释放
     */
}
