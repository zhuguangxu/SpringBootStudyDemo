package com.jianshu.demo.domain.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by on 2018/10/22.
 * 首页上的文章列表视图
 */
@Data
public class IndexArticleListVO implements Serializable {
    private Integer articleId;
    private Integer authorId;
    private String authorNickname;
    private String articleTitle;
    private String articleSummary;
    private String articleThumbnail;
    private Integer articleCommentCount;
    private Integer articleLikeCount;
}
