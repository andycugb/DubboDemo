package com.andycugb.dubbo;

/**
 * Created by jbcheng on 2016-01-28.
 */
public class GreetingService implements IGreetingService {
    @Override
    public void say() {
        System.out.println("welcome to use dubbo");
    }
}
