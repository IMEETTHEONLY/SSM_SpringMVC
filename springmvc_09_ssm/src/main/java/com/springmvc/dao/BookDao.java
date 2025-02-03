package com.springmvc.dao;

import com.springmvc.entity.Book;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BookDao {

    @Insert("insert into ssm_table (type,name,description) values(#{type},#{name},#{description})")
    public int save(Book book);

    @Update("update ssm_table set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public int update(Book book);

    @Delete("delete from ssm_table where id = #{id}")
    public int delete(Integer id);

    @Select("select * from ssm_table where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from ssm_table")
    public List<Book> getAll();


}
