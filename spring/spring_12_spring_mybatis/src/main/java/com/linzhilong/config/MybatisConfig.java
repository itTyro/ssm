package com.linzhilong.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {

    //定义bean, SqlSessionFactoryBean, 用于产生SqlSessionFactory对象
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean ssfy = new SqlSessionFactoryBean();

        //设置模型类的别名扫描
        ssfy.setTypeAliasesPackage("con.linzhilong.domain");

        //设置数据源
        ssfy.setDataSource(dataSource);

        return ssfy;
    }

    //定义bean, 返回MapperScannerConfigurer对象
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.linzhilong.dao");
        return msc;
    }

}
