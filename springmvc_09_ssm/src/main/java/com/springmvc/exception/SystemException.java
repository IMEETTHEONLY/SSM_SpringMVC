package com.springmvc.exception;
//异常分为编译异常和运行时异常  我们一般处理的是运行时异常
public class SystemException extends RuntimeException{
    private Integer code;

    public SystemException(Integer code) {
        this.code = code;
    }

    public SystemException( Integer code,String message) {
        super(message);
        this.code = code;
    }

    public SystemException(Integer code,String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
