package com.jianshu.demo.service;

import com.jianshu.demo.utils.ResponseUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicServiceTest {
    @Resource
    private TopicService topicService;
    @Test
    public void getOneTopicDetails() {
        ResponseUtil responseUtil = topicService.getOneTopicDetails(1);
        System.out.println(responseUtil);
    }

    @Test
    public void getAllTopics() {
    }

    @Test
    public void getIndexTopicListVo() {
    }
}