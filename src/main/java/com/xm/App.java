package com.xm;

import com.xm.controller.UserController;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        UserController bean = applicationContext.getBean(UserController.class);

    }
}
