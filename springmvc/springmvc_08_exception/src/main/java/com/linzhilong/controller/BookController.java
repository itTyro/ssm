package com.linzhilong.controller;

import com.linzhilong.domain.Book;
import com.linzhilong.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        if (id == 1){
            throw new BusinessException(Code.BUSINESS_ERR,"请不要调皮!");
        }
        Book book = bookService.getById(id);
        try {
            int i = 1/0;
        } catch (Exception e) {
            throw new SystemException(Code.SYSTEM_ERR,"服务器繁忙,请稍后重试!",e);
        }
        //判断数据是否为空
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        return new Result(code, book);
    }

    @GetMapping
    public Result getAll() {
        List<Book> bookList = bookService.getAll();

        Integer code = bookList != null ? Code.GET_OK : Code.GET_ERR;

        String msg = bookList != null ? "" : "查询失败,请重试!";
        return new Result(bookList, code, msg);
    }
}
