package com.linzhilong.dao;

import com.linzhilong.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("bookDao");
    }
}
