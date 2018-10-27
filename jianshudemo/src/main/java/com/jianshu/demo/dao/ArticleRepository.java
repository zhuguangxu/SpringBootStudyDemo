package com.jianshu.demo.dao;

import com.jianshu.demo.domain.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


/**
 * Created by zgx on 2018/10/22.
 * 文章的Repository接口
 */
public interface ArticleRepository extends JpaRepository<Article,Integer> {

    /**
     * 根据文章Id查看一篇文章的内容
     * @param articleId
     * @return
     */
    Article findArticleByArticleId(Integer articleId);


    /**
     * 用于专题详情页中获得某个专题下的文章列表
     * @param topicId
     * @return
     */
    @Query("from Article a where a.topicId=:topicId")
    List<Article> findArticlesByTopicId(@Param("topicId") Integer topicId);


    @Query("from Article a where a.authorId=:authorId")
    List<Article> findArticlesByAuthorId(@Param("authorId") Integer authorId);
}
