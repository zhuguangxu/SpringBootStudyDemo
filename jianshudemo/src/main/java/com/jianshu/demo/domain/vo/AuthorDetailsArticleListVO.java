package com.jianshu.demo.domain.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by zgx on 2018/10/27.
 */
@Data
public class AuthorDetailsArticleListVO  implements Serializable{
    private Integer articleId;
    private String articleTitle;
    private String articleSummary;
    private String articleThumbnail;
    private Integer articleCommentCount;
    private Integer articleLikeCount;


    public AuthorDetailsArticleListVO() {

    }

    public AuthorDetailsArticleListVO(Integer articleId,
                                      String articleTitle,
                                      String articleSummary,
                                      String articleThumbnail,
                                      Integer articleCommentCount,
                                      Integer articleLikeCount) {
        this.articleId = articleId;
        this.articleTitle = articleTitle;
        this.articleSummary = articleSummary;
        this.articleThumbnail = articleThumbnail;
        this.articleCommentCount = articleCommentCount;
        this.articleLikeCount = articleLikeCount;
    }
}
