package com.linzhilong.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.linzhilong.controller","com.linzhilong.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
