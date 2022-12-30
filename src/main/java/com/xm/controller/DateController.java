package com.xm.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * 日期参数传递
 */
@Controller
@RequestMapping("/date")
public class DateController {

    // 日期参数 传递
    // DateTimeFormat 注解是解决日期数据兼容性的问题,指定格式
    @RequestMapping("/dateParam")
    @ResponseBody
    public String dateParam(Date date,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,
                            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date2) {
        System.out.println("参数传递 date:" + date);
        System.out.println("参数传递 date1:" + date1);
        System.out.println("参数传递 date2:" + date2);
        return "{'module','data param'}";
    }
}
