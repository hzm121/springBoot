package com.hzm;

import com.hzm.controller.AuthorSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DospringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DospringbootApplication.class, args);
    }
//    @Value("${book.name}")
//    private String bookName;
//    @Value("${book.author}")
//    private String bookAuthor;
    @Autowired
    private AuthorSetting authorSetting;
    @RequestMapping("/")
    String index(){
        return authorSetting.getBookName()+":"+authorSetting.getBookAuthor();
    }
}
