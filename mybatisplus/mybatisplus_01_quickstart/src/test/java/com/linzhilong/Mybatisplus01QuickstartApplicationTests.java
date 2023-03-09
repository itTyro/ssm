package com.linzhilong;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.linzhilong.dao.UserDao;
import com.linzhilong.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus01QuickstartApplicationTests {

    @Autowired
    private UserDao userDao;
    @Test
    void getAll() {
        List<User> users = userDao.selectList(null);
        System.out.println(users);
    }

    @Test
    void getById() {
        User user = userDao.selectById(1);
        System.out.println(user);
    }

    @Test
    void update() {
        User user = new User();
        user.setId(1L);
        user.setAge(19);
        user.setName("林志龙");
        user.setTel("17350634283");
        user.setPassword("1234");
        userDao.updateById(user);
    }

    @Test
    void testSave() {
        User user = new User();
        user.setAge(19);
        user.setName("林志龙");
        user.setTel("17350634283");
        user.setPassword("1234");
        userDao.updateById(user);
        userDao.insert(user);
    }

    @Test
    void testDeleteById() {
        userDao.deleteById(1632643650998063106L);
    }

    @Test
    void page() {
        Page<User> page = new Page<>(1, 2);
        Page<User> userPage = userDao.selectPage(page, null);
        //3 获取分页结果
        System.out.println("当前页码值："+page.getCurrent());
        System.out.println("每页显示数："+page.getSize());
        System.out.println("一共多少页："+page.getPages());
        System.out.println("一共多少条数据："+page.getTotal());
        System.out.println("数据："+page.getRecords());
        System.out.println(userPage);
    }
}
