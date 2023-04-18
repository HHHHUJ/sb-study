package com.mooc.sb2.controller;

import com.mooc.sb2.bean.User;
import com.mooc.sb2.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping("/findById/{id}")
    public HashMap findById(@PathVariable("id") Integer id) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        User result = this.userService.findById(id);
        stringObjectHashMap.put("success", true);
        stringObjectHashMap.put("data", result);
        return stringObjectHashMap;
    }
    @GetMapping("findAll")
    public HashMap findAll() {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        List<User> result = this.userService.findAll();
        stringObjectHashMap.put("success", true);
        stringObjectHashMap.put("data", result);
        return stringObjectHashMap;
    }
    @PostMapping("save")
    public HashMap save(@RequestBody User user) {
        System.out.println(user);
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        Integer result = this.userService.save(user);
        objectObjectHashMap.put("success", true);
        objectObjectHashMap.put("data", result);
        return objectObjectHashMap;
    }
    @DeleteMapping("delete")
    public HashMap delete(Integer id) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        this.userService.delete(id);
        objectObjectHashMap.put("success", true);
        objectObjectHashMap.put("data", 0);
        return objectObjectHashMap;
    }
    @PostMapping("update")
    public HashMap update(@RequestBody User user) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        Integer result = this.userService.update(user);
        objectObjectHashMap.put("success", true);
        objectObjectHashMap.put("data", result);
        return objectObjectHashMap;
    }
}
