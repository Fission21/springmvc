package com.xm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 1,定义表现层bean
@Controller
// 定义整个模块的请求前缀
@RequestMapping("/user")
public class UserController {
    // 2,设置当前操作的访问路径
    @RequestMapping("/save")
    // 3,设置当前操作的返回路径
    @ResponseBody
    public String save() {
        System.out.println("user save .....");
        return "{'module':'springmvc'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete() {
        System.out.println("user delete .....");
        return "{'module':'usr delete'}";
    }

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name, int age) {
        System.out.printf("name" + name);
        System.out.printf("*************");
        System.out.printf("age" + age);
        return "{’module‘:'common param'}";
    }
}
