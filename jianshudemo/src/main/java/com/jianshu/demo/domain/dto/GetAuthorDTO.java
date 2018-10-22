package com.jianshu.demo.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 查询作者的数据传输DTO
 */
@Data
public class GetAuthorDTO implements Serializable {
    private Integer authorId;
}
