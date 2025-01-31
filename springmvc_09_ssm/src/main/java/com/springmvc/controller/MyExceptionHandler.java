package com.springmvc.controller;

import com.springmvc.exception.BussinessException;
import com.springmvc.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice  //声明是一个全局异常处理类
public class MyExceptionHandler {

    //捕捉业务异常
    @ExceptionHandler(BussinessException.class)
    public Result<String> BussinessException(BussinessException ex){
        System.out.println(ex.getMessage());
        return new Result<>(Code.Business_ERR,ex.getMessage());
    }

    //捕捉系统异常
    @ExceptionHandler(SystemException.class)
    public Result<String> SystemException(SystemException ex){
        System.out.println(ex.getMessage());
        return new Result<>(Code.SYSTEM_UNKNOWN_ERR,ex.getMessage());
    }

    //步骤其他异常
    @ExceptionHandler(Exception.class)
    public Result<String> exception(Exception ex){
        System.out.println(ex.getMessage());
        return new Result<>(Code.SYSTEM_UNKNOWN_ERR,"遇见未知异常",ex.getMessage());
    }
}
