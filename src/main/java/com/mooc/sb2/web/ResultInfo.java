package com.mooc.sb2.web;


import com.alibaba.fastjson.JSON;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@SuppressWarnings("all")
@Data
@ApiModel
public class ResultInfo<T> implements Serializable {
    private static final long serialVersionUID = 4379129506879806179L;

    @ApiModelProperty(value = "响应数据体")
    private T data;

    @ApiModelProperty(value = "是否成功")
    private boolean success;

    @ApiModelProperty(value = "响应提示信息")
    private String msg;

    @ApiModelProperty(value = "响应编码")
    private Integer statusCode = 200;

    public ResultInfo() {
    }

    public static ResultInfo instance() {
        ResultInfo ri = new ResultInfo();
        ri.setSuccess(true);
        return ri;
    }

    public static <T> ResultInfo<T> instance(T data) {
        ResultInfo ri = new ResultInfo();
        ri.setData(data);
        ri.setSuccess(true);
        return ri;
    }


    public static ResultInfo success() {
        return ResultInfo.instance();
    }

    public static ResultInfo fail(String msg) {
        ResultInfo ri = new ResultInfo();
        ri.setSuccess(false);
        ri.setMsg(msg);
        return ri;
    }

    public static <T extends Object> ResultInfo<T> success(T data) {
        ResultInfo<T> ri = ResultInfo.instance();
        ri.setData(data);
        return ri;
    }

    public void fail() {
        this.success = false;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}

