package com.linzhilong;

import com.linzhilong.config.SpringConfig;
import com.linzhilong.domain.Account;
import com.linzhilong.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService service = ctx.getBean(AccountService.class);
        Account ac = service.findById(2);
        System.out.println(ac);
    }
}
