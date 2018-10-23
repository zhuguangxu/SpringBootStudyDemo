package com.jianshu.demo.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by on 2018/10/23.
 * 专题和作者数据传输的DTO
 */
@Data
public class AuthorAndTopicDTO implements Serializable {
    private Integer authorId;

    private Integer topicId;

    public AuthorAndTopicDTO() {

    }

    public AuthorAndTopicDTO(Integer authorId, Integer topicId) {
        this.authorId = authorId;
        this.topicId = topicId;
    }
}