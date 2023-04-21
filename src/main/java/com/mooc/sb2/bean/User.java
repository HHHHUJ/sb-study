package com.mooc.sb2.bean;

import com.mooc.sb2.entity.BaseEntity;
import lombok.Data;

@Data
public class User extends BaseEntity {
    private Integer age;
    private String name;
    private String password;
}