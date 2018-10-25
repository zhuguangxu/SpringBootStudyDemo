package com.jianshu.demo.domain.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by zgx on 2018/10/23.
 * 轮播图持久化类
 */
@Entity
@Data
public class Carousel {

    @Id
    private Integer carouselImgId;

    private String carouselImgUrl;
}
