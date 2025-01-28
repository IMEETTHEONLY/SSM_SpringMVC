package com.springmvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    //静态资源放行不让mvc拦截


    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将前端的page/**路径匹配到page/下面
//        以此类推
        registry.addResourceHandler("pages/**").addResourceLocations("/pages/");
        registry.addResourceHandler("css/**").addResourceLocations("/css/");
        registry.addResourceHandler("js/**").addResourceLocations("/js/");
        registry.addResourceHandler("plugins/**").addResourceLocations("/plugins/");
    }
}
