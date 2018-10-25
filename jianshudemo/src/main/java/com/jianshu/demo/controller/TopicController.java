package com.jianshu.demo.controller;


import com.jianshu.demo.domain.dto.GetTopicDTO;
import com.jianshu.demo.service.TopicService;
import com.jianshu.demo.utils.ResponseUtil;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping(value = "/oneTopicDetails",method = RequestMethod.POST )
    public ResponseUtil getOneTopicDetais(@RequestBody GetTopicDTO getTopicDTO){
        return topicService.getOneTopicDetails(getTopicDTO.getTopicId());
    }
}
