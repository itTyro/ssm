package com.linzhilong.service.impl;

import com.linzhilong.dao.BookDao;
import com.linzhilong.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void save() {
        System.out.println("book service...");

        bookDao.save();
    }
}
