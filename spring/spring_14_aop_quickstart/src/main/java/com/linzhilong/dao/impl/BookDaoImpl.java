package com.linzhilong.dao.impl;

import com.linzhilong.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("book dao save...");
    }

    @Override
    public void update() {
        System.out.println("book dao update...");
    }
}
