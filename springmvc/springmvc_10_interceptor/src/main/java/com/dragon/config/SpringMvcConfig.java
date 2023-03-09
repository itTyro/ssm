package com.dragon.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.dragon.controller","com.dragon.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
