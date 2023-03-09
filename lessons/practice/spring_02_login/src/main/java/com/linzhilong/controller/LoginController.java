package com.linzhilong.controller;

import com.linzhilong.domain.User;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @PostMapping
    public String loginUser(@RequestBody User user) {
        System.out.println("user" + user);
        String username = user.getUsername();
        String password = user.getPassword();
        if (username.equals("林志龙") && password.equals("21020210137")) {
            return "success";
        }
        else return "no";
    }
}
