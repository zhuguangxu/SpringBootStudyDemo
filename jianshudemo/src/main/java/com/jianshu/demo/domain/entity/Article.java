package com.jianshu.demo.domain.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by lq on 2018/10/22.
 * 文章实体
 */
@Entity
@Data
public class Article {

    @Id
    private Integer articleId;//文章Id

    private Integer authorId;//文章作者Id

    private Integer topicId;//文章所属专题Id

    private String articleTitle;//文章标题

    private String articleSummary;//文章概览

    private String articleContent;//文章内容

    private String articleThumbnail;//文章缩略图

    private String articlePublishTime;//文章发表时间

    private Integer articleWordsCount;//文章字数

    private Integer articleReadCount;//文章阅读数

    private Integer articleCommentCount;//文章评论数

    private Integer articleLikeCount;//文章喜欢数


    public Article() {

    }


}
