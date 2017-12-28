package com.gxf.aop;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 58 on 2017/12/28.
 */
public class TestAop {

    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloAOP helloAOP = context.getBean(HelloAOP.class);
        helloAOP.sayHello();
    }

}
