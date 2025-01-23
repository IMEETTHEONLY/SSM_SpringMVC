package com.springmvc;

import com.springmvc.config.SpringConfig;
import com.springmvc.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class App {
    public static void main(String[] args) {
        //获取ioc容器哦
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);

        //测试:获取controller
        UserController bean = applicationContext.getBean(UserController.class);

        System.out.println(bean);
    }

}
