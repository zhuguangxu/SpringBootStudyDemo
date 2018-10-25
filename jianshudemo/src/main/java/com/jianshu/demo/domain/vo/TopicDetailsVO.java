package com.jianshu.demo.domain.vo;

import com.jianshu.demo.domain.entity.Topic;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zgx on 2018/10/23.
 * 专题详情页面的视图
 */
@Data
public class TopicDetailsVO implements Serializable {
    private Topic topic;
    private List<IndexArticleListVO> articleListVOList;
    private List<TopicDetailsAuthorListVO> authorListVOList;


    public TopicDetailsVO() {

    }

    public TopicDetailsVO(Topic topic,
                          List<IndexArticleListVO> articleListVOList,
                          List<TopicDetailsAuthorListVO> authorListVOList) {
        this.topic = topic;
        this.articleListVOList = articleListVOList;
        this.authorListVOList = authorListVOList;
    }
}
