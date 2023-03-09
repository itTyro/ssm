package com.linzhilong.controller;

import com.linzhilong.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/readData")
public class ReadDataController {

    @Value("${enterprise.age}")
    private Integer age;

    @Autowired
    private Enterprise enterprise;


    @Autowired
    private Environment env;

    @GetMapping
    public String readData() {
        System.out.println(env.getProperty("enterprise.name"));
        System.out.println(age);
        System.out.println(enterprise);
        return "read data success";
    }
}
