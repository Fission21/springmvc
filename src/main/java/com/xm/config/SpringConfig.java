package com.xm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
// 第一种，为了避免spring加载到mvc bean所做出的第一种改动，即精确扫包路径
//@ComponentScan({"com.xm.service","com.xm.dao"})

// 第二种使用配置法来排除Controller
@ComponentScan(value = "com.xm", excludeFilters = @ComponentScan.Filter
        (type = FilterType.ANNOTATION, classes = Controller.class))
public class SpringConfig {
}
