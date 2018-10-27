package com.jianshu.demo.domain.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by zgx on 2018/10/27.
 */
@Data
public class AuthorDetailsAuthorVO implements Serializable{

    private Integer authorId;

    private String authorNickname;

    private String authorAvatar;

    private String authorDescription;//作者描述

    private Integer authorFollowCount;//关注数

    private Integer authorFansCount;//粉丝数

    private Integer authorArticleCount;//文章数

    private Integer authorWordsCount;//字数

    private Integer authorFavoriteCount;//收获的喜欢数


    public AuthorDetailsAuthorVO() {

    }

    public AuthorDetailsAuthorVO(Integer authorId,
                                 String authorNickname,
                                 String authorAvatar,
                                 String authorDescription,
                                 Integer authorFollowCount,
                                 Integer authorFansCount,
                                 Integer authorArticleCount,
                                 Integer authorWordsCount,
                                 Integer authorFavoriteCount) {
        this.authorId = authorId;
        this.authorNickname = authorNickname;
        this.authorAvatar = authorAvatar;
        this.authorDescription = authorDescription;
        this.authorFollowCount = authorFollowCount;
        this.authorFansCount = authorFansCount;
        this.authorArticleCount = authorArticleCount;
        this.authorWordsCount = authorWordsCount;
        this.authorFavoriteCount = authorFavoriteCount;
    }
}
