package com.linzhilong.service.impl;

import com.linzhilong.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService implements com.linzhilong.service.AccountService {

    @Autowired
    private AccountDao accountDao;
    @Override
    @Transactional
    public void transfer(String out, String in, Double money) {
        accountDao.inMoney(in, money);
        int i = 1 / 0;
        accountDao.outMoney(out,money);
    }
}
