package com.mooc.sb2.mapper;

import com.mooc.sb2.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserMapper {
    User findById(Integer id);
    List<User> findAll();
    int save(User user);
    int update(User user);
    void delete(Integer id);
}
