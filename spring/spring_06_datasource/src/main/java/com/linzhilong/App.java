package com.linzhilong;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        /*Druid
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        System.out.println(dataSource);*/

        //c3p0
        DataSource dataSource = (DataSource) context.getBean("c3p0DataSource");
        System.out.println(dataSource);
    }
}
