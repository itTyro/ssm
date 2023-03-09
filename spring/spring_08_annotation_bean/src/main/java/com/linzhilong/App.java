package com.linzhilong;

import com.linzhilong.config.SpringConfig;
import com.linzhilong.dao.BookDao;
import com.linzhilong.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) context.getBean("bookDao");
        bookDao.save();

        BookService bean = context.getBean(BookService.class);
        bean.save();
    }
}
