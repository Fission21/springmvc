package com.xm.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 1,定义表现层bean
@Controller
public class UserController {
    // 2,设置当前操作的访问路径
    @RequestMapping("/save")
    // 3,设置当前操作的返回路径
    @ResponseBody
    public String save(){
        System.out.println("user save .....");
        return "{'module':'springmvc'}";
    }
}
