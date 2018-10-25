package com.jianshu.demo.service;

import com.jianshu.demo.utils.ResponseUtil;

/**
 * Created by zgx on 2018/10/23.
 * 专题的Service
 */
public interface TopicService {

    /**
     * 根据专题Id获取专题的详情
     * @param topicId
     * @return
     */
    ResponseUtil getOneTopicDetails(Integer topicId);


    /**
     * 获取所有专题
     * @return
     */
    ResponseUtil getAllTopics();


    /**
     * 获得首页上的热门专题列表视图
     * @return
     */
    ResponseUtil getIndexTopicListVo();
}
