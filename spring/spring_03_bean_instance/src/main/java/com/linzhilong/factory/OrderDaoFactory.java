package com.linzhilong.factory;

import com.linzhilong.dao.OrderDao;
import com.linzhilong.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
        return new OrderDaoImpl();
    }
}
