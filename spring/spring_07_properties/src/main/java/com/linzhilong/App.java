package com.linzhilong;

import com.linzhilong.dao.impl.BookDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        DataSource dataSource = (DataSource) context.getBean("dataSource");
        System.out.println(dataSource);

//        BookDaoImpl bookDao = context.getBean("bookDao", BookDaoImpl.class);
//        bookDao.save();

        //查询系统环境变量
//        Map<String,String> nev = System.getenv();
//        System.out.println(nev);

    }
}
