package com.jianshu.demo.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 用于登陆的数据传输实体
 */
@Data
public class LoginDTO implements Serializable {

    private String account;
    private String password;

}
