package com.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

 @Configuration//配置类 是上一层调用下一层的接口  这个就是tomcat服务器来用servlet的入口
 //扫描要被spring管理的包
 @ComponentScan("com.springmvc.controller")
public class SpringMvcConfig {
}
