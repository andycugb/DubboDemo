package com.andycugb.dubbo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jbcheng on 2016-01-28.
 */
public class DubboTest {

    /**
     * test for dubbo invoke
     * 
     * @param args param be given
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        IGreetingService greetingService = (IGreetingService) ctx.getBean("sayHello");
        greetingService.say();
    }
}
