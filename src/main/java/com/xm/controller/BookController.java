package com.xm.controller;

import com.xm.domain.Book;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * rest交互 小案例
 * @author john
 * @version 1.1
 */

@RestController
@RequestMapping("/book")
public class BookController {

    // 保存
    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save ==> " + book);
        return "{module:'book save success'}";
    }

    // 查询  模拟数据
    @GetMapping
    public List<Book> getAll(){
        System.out.println("book getALL running");
        List<Book> books = new ArrayList<Book>();
        // 模拟数据
        Book book = new Book();
            book.setName("john");
            book.setType("入门教程");
            book.setDescription("小试牛刀");
        Book book1 = new Book();
            book1.setName("echo");
            book1.setType("大学的教程");
            book1.setDescription("牛逼");

        Book book2 = new Book();
            book2.setName("frank");
            book2.setType("超级赛亚人");
            book2.setDescription("厉害");
        books.add(book);
        books.add(book1);
        books.add(book2);
        return books;
    }
}
