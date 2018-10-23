package com.jianshu.demo.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by on 2018/10/22.
 * 传输文章的数据DTO
 */
@Data
public class GetArticleDTO implements Serializable {
    private Integer articleId;
}