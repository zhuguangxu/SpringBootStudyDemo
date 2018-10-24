package com.jianshu.demo.service;


import com.jianshu.demo.utils.ResponseUtil;

/**
 * Created by lq on 2018/10/23.
 * AuthorAndTopicService
 */
public interface AuthorAndTopicService {


    /**
     * 作者关注一个专题
     * @param authorId
     * @param topicId
     * @return
     */
    ResponseUtil addTopicFollow(Integer authorId, Integer topicId);


    /**
     * 作者取消一个专题关注
     * @param authorId
     * @param topicId
     * @return
     */
    ResponseUtil cancelTopicFollow(Integer authorId, Integer topicId);
}
