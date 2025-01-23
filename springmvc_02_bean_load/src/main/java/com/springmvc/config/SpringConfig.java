package com.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
//这样的配置就不会去读取 com.springmvc包下面的controller了
@ComponentScan(value = "com.springmvc",
        excludeFilters =@ComponentScan.Filter(
        type = FilterType.ANNOTATION,
        classes = Controller.class
))
public class SpringConfig {
}
