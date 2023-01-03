package com.xm.controller;

import com.xm.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 这个类用于测试REST开发
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
    @RequestMapping(value = "/rests",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user){
        System.out.println("user update ....." + user);
        return "{'module':'usr update'}";
    }
}
