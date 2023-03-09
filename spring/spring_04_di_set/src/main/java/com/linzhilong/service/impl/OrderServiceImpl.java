package com.linzhilong.service.impl;

import com.linzhilong.service.BookService;

public class OrderServiceImpl implements BookService {

    private String name;

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void save() {
        System.out.println(name + "今年" + age + "岁");
    }
}
