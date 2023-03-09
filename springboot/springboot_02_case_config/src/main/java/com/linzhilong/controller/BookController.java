package com.linzhilong.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping("/{id}")
    public String save(@PathVariable Integer id) {
        System.out.println("save===>" + id );

        return "hello:springboot";
    }
}
