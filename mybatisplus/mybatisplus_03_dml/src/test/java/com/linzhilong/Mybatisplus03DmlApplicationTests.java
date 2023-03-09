package com.linzhilong;

import com.linzhilong.dao.UserDao;
import com.linzhilong.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class Mybatisplus03DmlApplicationTests {

    @Resource
    private UserDao userDao;
    @Test
    void testDelete() {
        userDao.deleteById(1);
    }

    @Test
    void testSave() {
        User user = new User();
        user.setPassword("1234455");
        user.setTel("13434255345");
        user.setName("Dragon");
        user.setAge(20);
        userDao.insert(user);
    }

}
