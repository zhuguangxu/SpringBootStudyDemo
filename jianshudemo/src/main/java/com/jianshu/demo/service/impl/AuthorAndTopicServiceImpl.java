package com.jianshu.demo.service.impl;

import com.jianshu.demo.dao.AuthorAndTopicRepository;
import com.jianshu.demo.domain.entity.AuthorAndTopic;
import com.jianshu.demo.service.AuthorAndTopicService;
import com.jianshu.demo.utils.ResponseUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zgx on 2018/10/27.
 */
@Service
public class AuthorAndTopicServiceImpl implements AuthorAndTopicService {


    @Resource
    private AuthorAndTopicRepository authorAndTopicRepository;


    @Override
    public ResponseUtil addTopicFollow(Integer authorId, Integer topicId, Integer status) {
        if (status == judgeSysAuthorIsFollowTopic(authorId, topicId)) {

        }
        return null;
    }

    @Override
    public ResponseUtil cancelTopicFollow(Integer authorId, Integer topicId) {
        return null;
    }

    @Override
    public int judgeSysAuthorIsFollowTopic(Integer authorId, Integer topicId) {
        AuthorAndTopic authorAndTopic = authorAndTopicRepository.findAuthorAndTopicByAuthorIdAndTopicId(authorId,topicId);
        if (authorAndTopic != null){
            return 1;//已经关注
        }else {
            return -1;
        }
    }
}
