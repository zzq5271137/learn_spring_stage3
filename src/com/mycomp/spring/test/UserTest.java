package com.mycomp.spring.test;

import com.mycomp.spring.service.IUserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void test() {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserService userService = (IUserService) applicationContext.getBean("userService");

        // ctrl + alt + b: 直接进入实现类里的方法
        userService.delete();
    }

}
