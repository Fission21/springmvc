package com.xm.controller;

import com.xm.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 最基础的Rest开发
 * @author john
 * @version 1.1
 */

@Controller
public class RestController {


    // REST中的save写法
    // 保存
    @RequestMapping(value = "/rests",method = RequestMethod.POST)
    @ResponseBody
    public String save(){
        System.out.println("user save ....." );
        return "{'module':'usr save'}";
    }

    // 删除
    @RequestMapping(value = "/rests/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println("user delete ....." + id);
        return "{'module':'usr delete'}";
    }

    // 查询
    @RequestMapping(value = "/rests/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable Integer id){
        System.out.println("user getByID ....." + id);
        return "{'module':'usr getByID'}";
    }

    // 修改
    // @RequestBody注解是Spring MVC用于将HTTP请求正文转换为Java对象的注解。
    @RequestMapping(value = "/rests",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user){
        System.out.println("user update ....." + user);
        return "{'module':'usr update'}";
    }
}
