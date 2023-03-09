package com.linzhilong;

import com.linzhilong.dao.BookDao;
import com.linzhilong.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot05SsmApplicationTests {

    @Autowired
    private BookDao bookDao;
    @Test
    void getById() {
        Book book = bookDao.getById(3);
        System.out.println(book);
    }

}
