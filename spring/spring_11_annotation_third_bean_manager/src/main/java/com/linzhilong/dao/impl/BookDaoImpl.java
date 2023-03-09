package com.linzhilong.dao.impl;

import com.linzhilong.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao...");
    }
}
