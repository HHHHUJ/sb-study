package com.mooc.sb2.service;

import com.mooc.sb2.bean.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
    Integer save(User user);
    Integer update(User user);
    void delete(Integer id);
}
