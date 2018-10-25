package com.jianshu.demo.controller;


import com.jianshu.demo.service.TopicService;
import com.jianshu.demo.utils.ResponseUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zgx on 2018/10/23.
 * topicController
 */
@RestController
@RequestMapping("/topic")
@CrossOrigin("http://localhost")
public class TopicController {

    @Resource
    private TopicService topicService;


    @RequestMapping(value = "/indexHotTopic",method = RequestMethod.GET)
    public ResponseUtil getIndexTopicListVo(){
        return topicService.getIndexTopicListVo();
    }

    @RequestMapping(value = "/allTopics",method = RequestMethod.GET)
    public ResponseUtil getAllTopics(){
        return topicService.getAllTopics();
    }
}
