package com.jianshu.demo.domain.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by  on 2018/10/23.
 * 首页上的热门专题列表
 */
@Data
public class IndexTopicListVO implements Serializable {
    private Integer topicId;//专题Id

    private String topicTitle;//专题标题

    private String topicAvatar;//专题头像

    public IndexTopicListVO() {

    }

    public IndexTopicListVO(Integer topicId, String topicTitle, String topicAvatar) {
        this.topicId = topicId;
        this.topicTitle = topicTitle;
        this.topicAvatar = topicAvatar;
    }
}
