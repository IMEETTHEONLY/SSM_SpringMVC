package com.springmvc.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

//要让他能够被tomcat服务器使用就要继承接口，然后实现里面的方法
//其实这里原来是加载servlet容器的方法的地方，但是现在使用的是mvc，所以说用来加载mvc的配置
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    //添加springmvc的配置
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        //返回web的bean
        AnnotationConfigWebApplicationContext ctx=new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class);
        //将配置信息返回即可
        return ctx;
    }
    //设置哪些请求是归属springMVC处理
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};  //这里设置了全部都被springmvc拦截
    }
    //加载spring的容器配置
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
