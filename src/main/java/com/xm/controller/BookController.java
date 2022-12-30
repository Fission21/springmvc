package com.xm.controller;

import com.xm.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
// 定义整个模块的请求前缀
@RequestMapping("/book")
public class BookController {

    @RequestMapping("/save")
    @ResponseBody
    /*
     * 这里验证了了 使用RequestParam 注解可以获取Controller方法里的形参和前端传来的参数不一样的问题
     * 前端参数的名字是name，收取是userName
     * */
    public String save(@RequestParam("name") String userName, int age) {
//    public String save(String name,int age){
        System.out.printf("book save ....");
        System.out.println("普通参数传递" + userName);
        System.out.println("普通参数传递" + age);
        return "{’module‘:'book save'}";
    }

    //传递参数用的,list json格式
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJon(@RequestBody List<String> likes) {
        System.out.println("list common(json) 参数传递 list ==" + likes);
        return "{'module':'list common for json param'}";
    }

    //传递参数用的,pojo json格式
    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user) {
        System.out.println("pojo(json) 参数传递 user ==" + user);
        return "{'module','pojo for json param'}";
    }

    // 传递参数用的,list pojo json格式
    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> user) {
        System.out.println("pojo(json) 参数传递 user ==" + user);
        return "{'module','pojo for json param'}";
    }

}
