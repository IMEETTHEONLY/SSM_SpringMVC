package com.springmvc.exception;

public class BussinessException extends RuntimeException{
    private Integer code;

    public BussinessException(Integer code) {
        this.code = code;
    }

    public BussinessException( Integer code,String message) {
        super(message);
        this.code = code;
    }

    public BussinessException(Integer code,String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
