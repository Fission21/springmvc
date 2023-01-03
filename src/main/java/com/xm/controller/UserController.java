package com.xm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

//@RequestMapping("/user")
public class UserController {
    // 屁股后面用method 是 REST风格的请求
    // 新增保存用POST，查询用GET，修改用PUT,删除用delete
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public String save() {
        System.out.println("user save .....");
        return "{'module':'springmvc'}";
    }

    // REST 删除
    /*
    * @PathVariable 是路径变量的意思
    * 因为delete方法的格式是 http://localhost:8080/users/1
    * 这里的1是路径，不是get参数中的?1这种
    * */
    @RequestMapping(value = "/users{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id) {
        System.out.println("user delete ....." + id);
        return "{'module':'usr delete'}";
    }

    @RequestMapping("/commonParam")

    public String commonParam(String name, int age) {
        System.out.printf("name" + name);
        System.out.printf("*************");
        System.out.printf("age" + age);
        return "{’module‘:'common param'}";
    }
}
