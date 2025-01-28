package com.springmvc.controller;

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

    @RequestMapping("/time")   //这个注解是接收参数的普遍注解,post get都能接收
    @ResponseBody  //返回json类型的数据
    //测试接收Data的参数                //这个格式要和前端时间格式进行对应格式,否则就会转换失败
    public String useradd( Date data,@DateTimeFormat(pattern = "yyyy-MM-dd") Date data1){
        System.out.println("data的数据是:"+data);
        System.out.println("data1的数据是:"+data1);
        System.out.println("user add...");
        String result="{'name','wq'}";  //键值对的字符串会自动转换为json数据
        return result;
    }




}
