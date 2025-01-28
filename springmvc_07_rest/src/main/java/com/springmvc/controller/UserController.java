package com.springmvc.controller;

import com.springmvc.entity.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

//通过REST风格进行开发

@Controller  //mvc控制器
public class UserController {
    //获取全部user信息
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @ResponseBody
    public String useradd(){

        System.out.println("users get");
        return "{'name':wq,'age':20}";
    }

    //删除user
    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id){

        System.out.println("users delete"+id);
        return "{'name':wanshiqi,'age':13}";
    }


}
