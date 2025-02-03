package com.springmvc.service.impl;

import com.springmvc.dao.BookDao;
import com.springmvc.entity.Book;
import com.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;  //这里是mybatis的自动代理 没有交给sprint管理 所以说报错

    public boolean save(Book book) {
        //判断影响行数是否大于0
       return bookDao.save(book)>0;

    }

    public boolean update(Book book) {
        return bookDao.update(book)>0;

    }

    public boolean delete(Integer id) {
       return bookDao.delete(id)>0;

    }

    public Book getById(Integer id) {
        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }


}
