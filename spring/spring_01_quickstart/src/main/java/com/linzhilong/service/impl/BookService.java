package com.linzhilong.service.impl;

import com.linzhilong.dao.BookDao;


public class BookService implements com.linzhilong.service.BookService {

    //5.删除业务层中使用new的方法创建的dao对象
    private BookDao bd;

    @Override
    public void save() {
        System.out.println("bookService");
        bd.save();
    }

    //6.提供对应的set方法


    public void setBd(BookDao bd) {
        this.bd = bd;
    }
}
