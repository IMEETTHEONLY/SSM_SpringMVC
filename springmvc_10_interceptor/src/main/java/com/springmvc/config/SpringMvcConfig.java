package com.springmvc.config;

import com.springmvc.controller.intercepter.ProjectInterceptor;
import com.springmvc.controller.intercepter.ProjectInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration//配置类 是上一层调用下一层的接口  这个就是tomcat服务器来用servlet的入口
 //扫描要被spring管理的包
 @ComponentScan("com.springmvc.controller")   //这里就已经没有扫描SpringMvcSupport了
 @EnableWebMvc    //这里实现了WebMvcConfigurer和SpringMvcSupport里面实现的方法都是一样的均可以实现拦截器的注册和访问静态资源
public class SpringMvcConfig implements WebMvcConfigurer {


  @Autowired
  private ProjectInterceptor projectInterceptor;

 @Autowired
 private ProjectInterceptor2 projectInterceptor2;
 @Override
 public void addInterceptors(InterceptorRegistry registry) {

  registry.addInterceptor(projectInterceptor).addPathPatterns("/books");
  registry.addInterceptor(projectInterceptor2).addPathPatterns("/books");
 }
}
