package com.mooc.sb2.bean;

import com.mooc.sb2.entity.BaseEntity;

public class User extends BaseEntity {
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(Integer id, Integer age, String name, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.password = password;
    }

    private Integer id;
    private Integer age;
    private String name;
    private String password;

}