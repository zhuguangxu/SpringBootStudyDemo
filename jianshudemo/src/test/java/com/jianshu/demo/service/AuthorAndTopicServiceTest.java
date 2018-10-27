package com.jianshu.demo.service;

import com.jianshu.demo.dao.AuthorAndTopicRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorAndTopicServiceTest {
    @Resource
    private AuthorAndTopicRepository authorAndTopicRepository;

    @Test
    public void addTopicFollow() {
    }

    @Test
    public void cancelTopicFollow() {
    }

    @Test
    public void judgeSysAuthorIsFollowTopic() {
    }
}