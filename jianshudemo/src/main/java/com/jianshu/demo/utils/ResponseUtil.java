package com.jianshu.demo.utils;

import lombok.Data;

import java.io.Serializable;

/**2018/10/22.
 * 用于进行前端响应返回数据的工具类
 */

@Data
public class ResponseUtil implements Serializable {
    private int Code;//响应状态码
    private String message;//响应的描述信息
    private Object data;//数据


    public ResponseUtil() {
    }

    public ResponseUtil(int code, String message) {
        Code = code;
        this.message = message;
    }


    public ResponseUtil(int code, String message, Object data) {
        Code = code;
        this.message = message;
        this.data = data;
    }
}
