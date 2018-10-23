package com.jianshu.demo.dao;


import com.jianshu.demo.domain.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lq on 2018/10/23.
 * 专题Repository接口
 */
public interface TopicRepository extends JpaRepository<Topic,Integer> {

    /**
     * 根据专题Id获得专题的信息
     * @param topicId
     * @return
     */
    Topic findTopicByTopicId(Integer topicId);
}
