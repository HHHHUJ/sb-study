package com.mooc.sb2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    // 获取.yml 文件中值
    private String name;

    // 获取 age
    private String age;

    //路径映射，对应浏览器访问的地址，访问该路径则执行下面函数
    @GetMapping("/hello")
    public String hello() {
        return  "hello world!!!444444";
    }

    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
