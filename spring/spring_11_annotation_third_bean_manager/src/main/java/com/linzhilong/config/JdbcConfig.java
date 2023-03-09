package com.linzhilong.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.linzhilong.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {

    //基本类型注入使用成员变量
    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost:3306/spring_db")
    private String url;
    @Value("root")
    private String username;
    @Value("1234")
    private String password;


    @Bean
    //引用类型注入直接设置参数,自动装配
    public DataSource dataSource(BookDao bookDao) {

        System.out.println(bookDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
}
