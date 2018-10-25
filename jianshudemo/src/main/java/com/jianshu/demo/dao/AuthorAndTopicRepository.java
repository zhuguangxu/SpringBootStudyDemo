package com.jianshu.demo.dao;


import com.jianshu.demo.domain.entity.AuthorAndTopic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by zgx on 2018/10/23.
 * 作者和专题关联实体类Repository接口
 */
public interface AuthorAndTopicRepository extends JpaRepository<AuthorAndTopic,Integer> {


    /**
     * 用于专题详情中关注这个专题的作者列表
     * @param topicId
     * @return
     */
    @Query("from AuthorAndTopic a where a.topicId=:topicId")
    List<AuthorAndTopic> findATListByTopicId(Integer topicId);

}
