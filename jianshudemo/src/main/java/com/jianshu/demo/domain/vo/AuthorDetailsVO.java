package com.jianshu.demo.domain.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zgx on 2018/10/27.
 *
 */
@Data
public class AuthorDetailsVO implements Serializable{
    private AuthorDetailsAuthorVO author;
    private List<AuthorDetailsArticleListVO> authorDetailsArticleListVOList;

    public AuthorDetailsVO() {

    }

    public AuthorDetailsVO(AuthorDetailsAuthorVO author,
                           List<AuthorDetailsArticleListVO> authorDetailsArticleListVOList) {
        this.author = author;
        this.authorDetailsArticleListVOList = authorDetailsArticleListVOList;
    }
}
