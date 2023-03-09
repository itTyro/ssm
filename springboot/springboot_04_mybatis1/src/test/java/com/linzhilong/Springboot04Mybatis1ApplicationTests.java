package com.linzhilong;

import com.linzhilong.dao.BookDao;
import com.linzhilong.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04Mybatis1ApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void getById() {
        Book bookDaoById = bookDao.getById(3);
        System.out.println("jieguo  " + bookDaoById);
    }

}
