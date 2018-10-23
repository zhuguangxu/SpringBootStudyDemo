package com.jianshu.demo.domain.entity;

import com.jianshu.demo.utils.ResponseUtil;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 作者实体
 */
@Data
@Entity
@Builder
public class Author extends ResponseUtil {

    @Id
    private Integer authorId;

    @Column(nullable = false)
    private String account;

    @Column(nullable = false)
    private String password;

    private String authorNickname;

    private String authorAvatar;

    private String authorDescription;//作者描述

    private Integer authorFollowCount;//关注数

    private Integer authorFansCount;//粉丝数

    private Integer authorArticleCount;//文章数

    private Integer authorWordsCount;//字数

    private Integer authorFavoriteCount;//收获的喜欢数


    public Author() {

    }


    public Author(Integer authorId,
                  String account,
                  String password,
                  String authorNickname,
                  String authorAvatar,
                  String authorDescription,
                  Integer authorFollowCount,
                  Integer authorFansCount,
                  Integer authorArticleCount,
                  Integer authorWordsCount,
                  Integer authorFavoriteCount) {
        this.authorId = authorId;
        this.account = account;
        this.password = password;
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
