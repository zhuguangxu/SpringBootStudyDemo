package com.jianshu.demo.domain.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by lq on 2018/10/23.
 * 专题和作者关联实体类
 */
@Data
@Entity
public class AuthorAndTopic {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer authorId;

    private Integer topicId;

    public AuthorAndTopic() {

    }

    public AuthorAndTopic(Integer id, Integer authorId, Integer topicId) {
        this.id = id;
        this.authorId = authorId;
        this.topicId = topicId;
    }
}
