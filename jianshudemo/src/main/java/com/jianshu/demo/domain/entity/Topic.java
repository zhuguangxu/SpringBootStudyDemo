package com.jianshu.demo.domain.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by zgx on 2018/10/23.
 * 专题持久化类
 */
@Entity
@Data
public class Topic {

    @Id
    private Integer topicId;//专题Id

    private String topicTitle;//专题标题

    private String topicAvatar;//专题头像

    private String topicSummary;//专题概览

    private Integer topicArticlesCount;//专题下文章数量

    private Integer topicFollowCount;//专题关注数量
}
