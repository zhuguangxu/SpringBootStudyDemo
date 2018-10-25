package com.jianshu.demo.service.impl;

import com.jianshu.demo.dao.AuthorRepository;
import com.jianshu.demo.domain.entity.Author;
import com.jianshu.demo.service.LoginService;
import com.jianshu.demo.utils.ResponseUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zgx on 2018/10/22.
 * 登陆接口的实现类
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private AuthorRepository authorRepository;

    /**
     * 作者登陆方法实现
     * @param account
     * @param password
     * @return
     */
    @Override
    public ResponseUtil login(String account, String password) {
        Author author = authorRepository.findAuthorByAccount(account);
        if (author != null){
            if (password.equals(author.getPassword())){
                return new ResponseUtil(0,"OK",author);
            }else {
                return new ResponseUtil(0,"Author password error");
            }
        }else {
            return new ResponseUtil(0,"No author!");
        }
    }
}
