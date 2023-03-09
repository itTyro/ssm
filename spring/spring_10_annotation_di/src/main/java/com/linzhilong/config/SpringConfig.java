package com.linzhilong.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.linzhilong")  //多个文件需要用数组{}
@PropertySource("classpath:jdbc.properties") //多个文件需要用数组{}
public class SpringConfig {
}
