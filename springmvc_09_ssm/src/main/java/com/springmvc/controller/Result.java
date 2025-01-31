package com.springmvc.controller;

public class Result<E> {
    private Integer code;
    private String msg;

    private E data;


    public Result() {
    }

    public Result(Integer code, String msg, E data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(Integer code, E data) {
        this.code = code;
        this.data = data;
    }

    /**
     * 获取
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 获取
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 获取
     * @return data
     */
    public E getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(E data) {
        this.data = data;
    }


}
