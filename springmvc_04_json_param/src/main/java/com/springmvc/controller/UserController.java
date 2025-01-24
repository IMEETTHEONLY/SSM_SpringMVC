package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//交给spring容器管理这个bean 这个bean是抓门用来接收前端的信息的特殊bean
@RequestMapping("user")
@Controller  //mvc控制器
public class UserController {

    @RequestMapping("/add")   //这个注解是接收参数的普遍注解,post get都能接收
    @ResponseBody  //返回json类型的数据
    //测试接收json数据
    public String useradd(@RequestBody List<String> likes){
        System.out.println("接受到的json数据是:"+likes);
        System.out.println("user add...");
        String result="{'name','wq'}";  //键值对的字符串会自动转换为json数据
        return result;
    }




}
