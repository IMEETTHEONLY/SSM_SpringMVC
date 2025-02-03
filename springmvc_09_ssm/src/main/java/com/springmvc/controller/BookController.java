package com.springmvc.controller;

import com.springmvc.entity.Book;
import com.springmvc.exception.BussinessException;
import com.springmvc.exception.SystemException;
import com.springmvc.service.BookService;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Result<Boolean> save(@RequestBody Book book) {
        boolean save = bookService.save(book);
        return new Result(save?Code.ADD_OK:Code.ADD_ERR,save);
    }

    @PutMapping
    public Result<Boolean> update(@RequestBody Book book) {

        //用于测试后端出现异常 前端是否能够有效处理
//                try {
//            int i=1/0;
//        } catch (Exception e) {
//            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器超时了");
//        }
        boolean save = bookService.update(book);
        return new Result(save?Code.UPDATE_OK:Code.UPDATE_ERR,save);
    }

    @DeleteMapping("/{id}")
    public Result<Book> delete(@PathVariable Integer id) {
        //用于测试后端出现异常 前端是否能够有效处理

//                try {
//            int i=1/0;
//        } catch (Exception e) {
//            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器超时了");
//        }
        boolean flag = bookService.delete(id);
        return new Result(flag?Code.DELETE_OK:Code.DELETE_ERR,flag);
    }

    @GetMapping("/{id}")
    public Result<Book> getById(@PathVariable Integer id) {
        if(id==1){
            throw new BussinessException(Code.Business_ERR,"请规范自己的输入的数据");
        }

        //用于测试后端出现异常 前端是否能够有效处理

//        try {
//            int i=1/0;
//        } catch (Exception e) {
//            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器超时了");
//        }
        Book flag = bookService.getById(id);
        Integer code=flag!= null ?Code.GET_OK:Code.GET_ERR;
        String msg=flag!= null ?"":"查询的数据不存在，请重试...";
        return new Result<>(code,msg,flag);
    }

    @GetMapping
    public Result<ArrayList<Book>>  getAll() {
        List<Book> books = bookService.getAll();
        Integer code=books!= null ?Code.GET_OK:Code.GET_ERR;
        String msg=books!= null ?"":"查询的数据不存在，请重试...";
        return new Result(code,msg,books);

    }

}
