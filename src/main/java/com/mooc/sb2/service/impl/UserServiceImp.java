package com.mooc.sb2.service.impl;

import com.mooc.sb2.bean.User;
import com.mooc.sb2.mapper.UserMapper;
import com.mooc.sb2.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("UserService")
public class UserServiceImp implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User findById(Integer id) {
        return this.userMapper.findById(id);
    }

    @Override
    public List<User> findAll() {
        return this.userMapper.findAll();
    }

    @Override
    public Integer save(User user) {
        return this.userMapper.save(user);
    }
    @Override
    public Integer update(User user) {
        return this.userMapper.update(user);
    }

    @Override
    public void delete(Integer id) {
        this.userMapper.delete(id);
    }
}
