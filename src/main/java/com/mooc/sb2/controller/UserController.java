package com.mooc.sb2.controller;

import com.mooc.sb2.bean.User;
import com.mooc.sb2.service.UserService;
import com.mooc.sb2.web.ResultInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping("/findById/{id}")
    public ResultInfo<User> findById(@PathVariable("id") Integer id) {
        return ResultInfo.success(userService.findById(id));
    }
    @GetMapping("findAll")
    public ResultInfo<List<User>> findAll() {
        return ResultInfo.success(userService.findAll());
    }
    @PostMapping("save")
    public ResultInfo<Integer> save(@RequestBody User user) {
        return ResultInfo.success(userService.save(user));
    }
    @DeleteMapping("delete")
    public ResultInfo<Void> delete(Integer id) {
        userService.delete(id);
        return ResultInfo.success();
    }
    @PostMapping("update")
    public ResultInfo<Integer> update(@RequestBody User user) {
        return ResultInfo.success(userService.update(user));
    }
}
