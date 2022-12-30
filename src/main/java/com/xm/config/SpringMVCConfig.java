package com.xm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

// 3，创建spring mvc的配置文件，加载controller对应的bean
@Configuration
@ComponentScan("com.xm")
// 开启由json数据转化为对象
@EnableWebMvc
public class SpringMVCConfig {
}
