package com.linzhilong.dao;

import com.linzhilong.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao {
    @Select("select * from tbl_book where id = #{id} ;")
    Book getById(Integer id);
}
