package com.study.test;

import com.study.junit.JunitTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** @author Jiafeng1.Li */
public class JunitTestTest {
    /** 初始化方法； 用于资源申请，所有测试方法在执行之前都会先执行该方法 */
    @Before
    public void init() {
        System.out.println("init.....");
    }

    /** s释放资源方法 在所有测试方法执行完后，都会自动执行该方法 */
    @After
    public void close() {
        System.out.println("close.....");
    }
    /** 测试add方法 */
    @Test
    public void testAdd() {
        JunitTest test = new JunitTest();
        int result = test.add(5, 6);
        // 断言，断言结果是多少
        Assert.assertEquals(11, result);
    }
}
