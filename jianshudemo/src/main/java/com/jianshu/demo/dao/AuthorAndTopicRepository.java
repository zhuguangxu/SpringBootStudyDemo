package com.jianshu.demo.dao;


import com.jianshu.demo.domain.entity.AuthorAndTopic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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
    List<AuthorAndTopic> findATListByTopicId(@Param("topicId") Integer topicId);

    /**
     * 根据作者的Id和专题的Id得到一个实体类
     * @param authorId
     * @param topicId
     * @return
     */
    AuthorAndTopic findAuthorAndTopicByAuthorIdAndTopicId(Integer authorId,Integer topicId);
}
