package com.jianshu.demo.domain.vo;

import lombok.Data;

/**
所有作者的视图
 */
@Data
public class AllAuthorListVO {
    private Integer authorId;
    private String authorNickname;
    private String authorAvatar;
    private String authorDescription;//作者描述

    public AllAuthorListVO() {

    }

    public AllAuthorListVO(Integer authorId,
                           String authorNickname,
                           String authorAvatar,
                           String authorDescription) {
        this.authorId = authorId;
        this.authorNickname = authorNickname;
        this.authorAvatar = authorAvatar;
        this.authorDescription = authorDescription;
    }


}
