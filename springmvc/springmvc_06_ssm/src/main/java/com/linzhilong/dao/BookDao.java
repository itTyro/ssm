package com.linzhilong.dao;

import com.linzhilong.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {

    @Insert("insert into tbl_book (type, name, description) values (#{type},#{name},#{description});")
    void save(Book book);

    @Delete("delete from tbl_book where id = #{id};")
    void delete(Integer id);

    @Update("update tbl_book set name = #{name},type = #{type}, description = #{description} where id = #{id};")
    void update(Book book);

    @Select("select * from tbl_book where id = #{id} ;")
    Book getById(Integer id);

    @Select("select * from tbl_book;")
    List<Book> getAll();
}
