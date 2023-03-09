package com.linzhilong.controller;

import com.linzhilong.domain.PageBean;

public class Result {
    private Object data;
    private Integer code;
    private String msg;
    private PageBean pb;

    public PageBean getPb() {
        return pb;
    }

    public void setPb(PageBean pb) {
        this.pb = pb;
    }

    public Result() {
    }

    public Result(Integer code, Object data) {
        this.data = data;
        this.code = code;
    }

    public Result(Object data, Integer code, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public Result(PageBean pb, Integer code, String msg) {
        this.pb = pb;
        this.code = code;
        this.msg = msg;
    }

    /**
     * 获取
     *
     * @return data
     */
    public Object getData() {
        return data;
    }

    /**
     * 设置
     *
     * @param data
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 获取
     *
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置
     *
     * @param code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 获取
     *
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置
     *
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return "Result{data = " + data + ", code = " + code + ", msg = " + msg + "}";
    }
}