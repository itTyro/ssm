package com.linzhilong;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Person bean = ctx.getBean(Person.class);
        bean.raiseDog();
        bean.raiseCat();
    }
}
