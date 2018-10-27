package com.jianshu.demo.dao;

import com.jianshu.demo.domain.entity.AuthorAndTopic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorAndTopicRepositoryTest {
    @Resource
    private AuthorAndTopicRepository authorAndTopicRepository;

    @Test
    public void findATListByTopicId() {
    }

    @Test
    public void findAuthorAndTopicByAuthorIdAndTopicId() {

        AuthorAndTopic authorAndTopic = authorAndTopicRepository.findAuthorAndTopicByAuthorIdAndTopicId(1,2);
        System.out.println(authorAndTopic);
    }
}