package com.jianshu.demo.controller;


import com.jianshu.demo.domain.dto.LoginDTO;
import com.jianshu.demo.service.LoginService;
import com.jianshu.demo.utils.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by zgx on 2018/10/22.
 * 登陆的controller
 */
@RestController
@RequestMapping("/login")
@CrossOrigin("http://localhost")
public class LoginController {

    @Resource
    private LoginService loginService;

    @RequestMapping(value = "/sign_in", method = RequestMethod.POST)
    public ResponseUtil login(@RequestBody LoginDTO loginDTO){
        return loginService.login(loginDTO.getAccount(),loginDTO.getPassword());
    }

}
