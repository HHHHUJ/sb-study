package com.mooc.sb2.controller;

import com.mooc.sb2.params.FilePathParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private FilePathParams filePathParams;
   @GetMapping("/hello")
    public String hello() {
       return filePathParams.getPath();
   }
}
