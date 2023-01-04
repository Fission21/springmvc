package com.xm.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * spring mvc 支持类
 * @author john
 * @version 1.1
 */

@Configuration
public class SpringmvcSupport extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 当访问/pages/???的某个资源的时候，走pages目录下的内容
        // 出现这个问题是因为在 ServletContainersInitConfig这个文件中配置了spring 容器拦截的范围
        // 这句话的含义是访问了 /pages 这个目录下的请求，就访问 /pages 这个目录下的东西
        //     资源处理                                              资源访问
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
        // 放行 css
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
        registry.addResourceHandler("/plugins/**").addResourceLocations("/plugins/");
    }
}
