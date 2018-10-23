package com.jianshu.demo.domain.vo;

import lombok.Data;

/**
 * Created by on 2018/10/23.
 * 专题详情页中的关注着列表视图
 */
@Data
public class TopicDetailsAuthorListVO {
    private Integer authorId;
    private String authorAvatar;

    public TopicDetailsAuthorListVO() {

    }

    public TopicDetailsAuthorListVO(Integer authorId, String authorAvatar) {
        this.authorId = authorId;
        this.authorAvatar = authorAvatar;
    }
}
