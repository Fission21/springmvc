package com.xm.controller;

import com.xm.domain.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

/**
 * 开发中简化的REST书写方式
 * @@RestController 注解 是‘@Controller’和’@ResponseBody‘的简写
 *
 * @author john
 * @version 1.1
 */

@RestController
@RequestMapping("/src")
public class SimpleRestController {

    @PostMapping
    public String save(){
        System.out.println("user save ....." );
        return "{'module':'usr save'}";
    }

    // 删除
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("user delete ....." + id);
        return "{'module':'usr delete'}";
    }

    // 查询
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("user getByID ....." + id);
        return "{'module':'usr getByID'}";
    }

    // 修改
    // @RequestBody注解是Spring MVC用于将HTTP请求正文转换为Java对象的注解。
    @PutMapping
    public String update(@RequestBody User user){
        System.out.println("user update ....." + user);
        return "{'module':'usr update'}";
    }
}
