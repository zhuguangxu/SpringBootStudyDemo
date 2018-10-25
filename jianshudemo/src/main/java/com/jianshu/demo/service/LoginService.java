package com.jianshu.demo.service;


import com.jianshu.demo.utils.ResponseUtil;


/**
 * Created by zgx on 2018/10/22.
 * 登陆Service接口
 */
public interface LoginService {

    /**
     * 作者的登陆方法
     * @param account
     * @param password
     * @return
     */
    ResponseUtil login(String account,String password);
}