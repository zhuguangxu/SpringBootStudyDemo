package com.jianshu.demo.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by on 2018/10/23.
 * 传输专题数据的DTO
 */
@Data
public class GetTopicDTO implements Serializable {
    private Integer topicId;
}
