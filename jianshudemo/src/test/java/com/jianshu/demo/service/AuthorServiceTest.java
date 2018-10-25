package com.jianshu.demo.service;

import com.jianshu.demo.utils.ResponseUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by zgx on 2018/10/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorServiceTest {

    @Resource
    private AuthorService authorService;

    @Test
    public void getOneAuthorByAuthorId() throws Exception {
        ResponseUtil responseUtil = authorService.getOneAuthorByAuthorId(1);
        System.out.println(responseUtil);
    }

    @Test
    public void getIndexAuthorListVo() throws Exception {
        ResponseUtil responseUtil = authorService.getIndexAuthorListVo();
        System.out.println(responseUtil);
    }

}