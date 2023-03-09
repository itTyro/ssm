package com.linzhilong.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.linzhilong")
@Import(JdbcConfig.class)
public class SpringConfig {
}
