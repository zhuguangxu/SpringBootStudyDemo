package com.jianshu.demo.domain.vo;

import lombok.Data;

/**
 * 首页作者列表视图
 */
@Data
public class IndexAuthorListVO {
    private Integer authorId;

    private String authorNickname;

    private String authorAvatar;

    private Integer authorWordsCount;//字数

    private Integer authorFavoriteCount;//收获的喜欢数

    public IndexAuthorListVO() {

    }

    public IndexAuthorListVO(Integer authorId,
                             String authorNickname,
                             String authorAvatar,
                             Integer authorWordsCount,
                             Integer authorFavoriteCount) {
        this.authorId = authorId;
        this.authorNickname = authorNickname;
        this.authorAvatar = authorAvatar;
        this.authorWordsCount = authorWordsCount;
        this.authorFavoriteCount = authorFavoriteCount;
    }
}
