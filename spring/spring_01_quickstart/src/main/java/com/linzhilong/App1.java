package com.linzhilong;

import com.linzhilong.service.BookService;

public class App1 {
    public static void main(String[] args) {
        BookService bs = new com.linzhilong.service.impl.BookService();
        bs.save();
    }
}
