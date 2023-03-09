package com.linzhilong;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linzhilong.dao.UserDao;
import com.linzhilong.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@SpringBootTest
class Mybatisplus02DqlApplicationTests {

    @Resource
    private UserDao userDao;
//    @Test
//    void testGetAll() {
//
//        QueryWrapper<User> qw = new QueryWrapper<>();
//        qw.le("age",19);
//        List<User> users = userDao.selectList(qw);
//        System.out.println(users);
//    }

   /* @Test
    void testGetAll() {

        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.lambda().le(User::getAge,19);
        List<User> users = userDao.selectList(qw);
        System.out.println(users);
    }*/

   /* @Test
    void testGetAll() {

        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        lqw.le(User::getAge,10);
        List<User> users = userDao.selectList(lqw);
        System.out.println(users);
    }*/

//    @Test
//    void testGetAll() {
//
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        //le小于,ge大于
////        lqw.le(User::getAge,30).ge(User::getAge,10);  //链式编程
//
//        /*
//            条件可能为空, 需要进行null的处理,否则程序运行出错
//        */
//
//        lqw.le(User::getAge, 30);
//        lqw.ge(User::getAge,10);
//        List<User> users = userDao.selectList(lqw);
//        System.out.println(users);
//    }


//    进行null的处理

    /*@Test
    void testGetAll() {

        //模拟用户传过来的数据
        QueryUser qu = new QueryUser();
//        qu.setAge(10);
        qu.setAge2(30);

        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        //原始办法使用if进行条件判定, 如果传过来的是null则不执行语句   弊端: 需要写一堆if条件,不太友好
        if (null != qu.getAge()) {
            lqw.le(User::getAge, qu.getAge());
        }

        if (qu.getAge2() != null) {
            lqw.ge(User::getAge, qu.getAge2());
        }
        List<User> users = userDao.selectList(lqw);
        System.out.println(users);
    }*/

//    @Test
//    void testGetAll() {
////      模拟用户传过来的数据
//        QueryUser qu = new QueryUser();
////        qu.setAge(10);
//        qu.setAge2(30);
//
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        lqw.le(qu.getAge2() != null,User::getAge,qu.getAge2());
//        lqw.ge(qu.getAge() != null,User::getAge,qu.getAge());
//        List<User> users = userDao.selectList(lqw);
//        System.out.println(users);
//    }

    //查询投影
//    @Test
//    void testGetAll() {
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        lqw.select(User::getAge,User::getName,User::getTel);
//        List<User> users = userDao.selectList(lqw);
//        System.out.println(users);
//    }

//    @Test
//    void testGetAll() {
//        QueryWrapper<User> lqw = new QueryWrapper<User>();
////        lqw.select("age","name","tel");
////        lqw.select("count(*) as count","tel"); //聚合函数count(*) 查询总条目数, as 后面写别名
//        lqw.select("max(age) as MaxAge");
////        lqw.groupBy("tel"); //分组查询
//
//        //lqw.select("count(*) as count");
//        //SELECT count(*) as count FROM user
//        //lqw.select("max(age) as maxAge");
//        //SELECT max(age) as maxAge FROM user
//        //lqw.select("min(age) as minAge");
//        //SELECT min(age) as minAge FROM user
//        //lqw.select("sum(age) as sumAge");
//        //SELECT sum(age) as sumAge FROM user
//        lqw.select("avg(age) as avgAge");
//        //SELECT avg(age) as avgAge FROM user
//        List<Map<String, Object>> users = userDao.selectMaps(lqw);
//        System.out.println(users);
//    }

    @Test
    void testGetAll() {
        QueryWrapper<User> qw = new QueryWrapper<>();
//        qw.between("age",10,30);      //添加查询,大于10,小于30
//        qw.like("name","J");    //模糊查询
//        qw.likeLeft("name","J");   //左边加占位符,模糊查询
//        qw.likeRight("name","J");   //右边加占位符, 模糊查询

        /**
         * condition ：条件，返回boolean，
         当condition为true，进行排序，如果为false，则不排序
         * isAsc:是否为升序，true为升序，false为降序
         * columns：需要操作的列
         */
        qw.orderBy(true,false,"age");
        List<User> users = userDao.selectList(qw);
        System.out.println(users);
    }
}
