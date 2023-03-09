package com.linzhilong.service.impl;

import com.linzhilong.dao.BookDao;
import com.linzhilong.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired //按类型注入
    @Qualifier("bookDao")
    private BookDao bookDao;

    //	  public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }
    @Override
    public void save() {
        System.out.println("book service...");
        bookDao.save();
    }
}
