package com.mooc.sb2.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mooc.sb2.entity.BaseEntity;

import java.util.Date;

public class Student extends BaseEntity {

    private String id;
    private String name;
    private String score;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateTime;
}
