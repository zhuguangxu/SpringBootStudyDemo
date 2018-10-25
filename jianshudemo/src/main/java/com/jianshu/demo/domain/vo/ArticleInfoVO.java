package com.jianshu.demo.domain.vo;

import com.jianshu.demo.domain.entity.Article;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by zgx on 2018/10/22.
 * 文章详情页的视图
 */
@Data
public class ArticleInfoVO implements Serializable{
    private Article article;
    private String authorNickname;
    private String authorAvatar;

    public ArticleInfoVO() {

    }

    public ArticleInfoVO(Article article, String authorNickname, String authorAvatar) {
        this.article = article;
        this.authorNickname = authorNickname;
        this.authorAvatar = authorAvatar;
    }
}
