package com.xm.controller;

import com.xm.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 响应的学习
 * */
@Controller
//@RequestMapping("/rpc")
public class ResponsePageController {

    // 响应页面/跳转数据
    @RequestMapping("/toJumpPage")
    public String toJumpPage(){
        System.out.println("跳转页面");
        return "page.jsp";
    }

    // 响应文本数据
    @RequestMapping("/toText")
    // 只有加上 ResponseBody 才会让mvc把这个返回值当string处理，不然会被当作页面处理
    @ResponseBody
    public String toText(){
        System.out.println("响应文本数据");
        return "response.text";
    }

    // 响应pojo对象
    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo(){
        System.out.println("返回json对象数据");
        User user = new User();
        user.setName("卧槽");
        user.setAge(19);
        return user;
    }

    //    响应pojo集合
    /*
    响应json数据是依靠 pom.xml 中 jack json来完成的
     */
    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList(){
        System.out.println("返回json集合数据");
        User user = new User();
        user.setName("数测名字一号");
        user.setAge(11);

        User user1 = new User();
        user1.setAge(12);
        user1.setName("数测名字二号");

        List<User> userList = new ArrayList<User>();
        userList.add(user);
        userList.add(user1);

        return userList;
    }
}
