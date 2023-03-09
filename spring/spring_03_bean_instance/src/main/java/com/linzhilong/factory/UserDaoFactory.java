package com.linzhilong.factory;

import com.linzhilong.dao.UserDao;
import com.linzhilong.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
