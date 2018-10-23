package com.jianshu.demo.service;

import com.lq.utils.ResponseUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by lq on 2018/10/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceTest {

    @Resource
    private LoginService loginService;
   @Test
    public void login() throws Exception {
       ResponseUtil responseUtil = loginService.login("aaa@163.com","aaa");
       System.out.println(responseUtil);
    }

}