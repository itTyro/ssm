package com.linzhilong.controller;

import com.linzhilong.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Controller
//@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save(String name, int age) {
        System.out.println("传进来的参数是" + name );
        System.out.println("传进来的参数是" + age );

        return "{'save':'user'}";
    }

    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user) {
        System.out.println(user);

        return "{'pojo':'param'}";
    }

    @RequestMapping("/pojoParamPojo")
    @ResponseBody
    public String pojoParamPojo(User user) {
        System.out.println(user);

        return "{'pojo':'param'}";
    }

    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> list) {
        System.out.println(list);

        return "{'pojo':'param'}";
    }

    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes) {
        System.out.println(likes);

        return "{'pojo':'param'}";
    }

    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user) {
        System.out.println(user);

        return "{'pojo':'param'}";
    }

    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> users) {
        System.out.println(users);

        return "{'pojo':'param'}";
    }

    @RequestMapping("/dateParam")
    @ResponseBody
    public String dataParam(Date data,@DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        System.out.println(data);
        System.out.println(data);
        return "{'data':'param'}";
    }
}
