package com.linzhilong;

import com.linzhilong.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDI {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        /*BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
        bookDao.save();*/
        BookService bookService = (BookService) applicationContext.getBean("bookService");
        bookService.save();
        BookService orderService = (BookService) applicationContext.getBean("orderService");
        orderService.save();
    }
}
