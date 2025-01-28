package com.springmvc.controller;

import com.springmvc.entity.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

//交给spring容器管理这个bean 这个bean是抓门用来接收前端的信息的特殊bean

@Controller  //mvc控制器
public class UserController {

    @RequestMapping("/toJumpPage")   //这个注解是接收参数的普遍注解,post get都能接收
    //不加注解ResponseBody,返回字符串的话就会默认去页面
    //@ResponseBody
    public String useradd(){
        return "/index.jsp";
    }

    //从对象转换为字符串传递给前端才传递的是json数据
    @RequestMapping("/Json")   //这个注解是接收参数的普遍注解,post get都能接收
    //不加注解ResponseBody,返回字符串的话就会默认去页面
    @ResponseBody
    public User json(){

        User u=new User("万顷",50);

        return u;
    }


}
