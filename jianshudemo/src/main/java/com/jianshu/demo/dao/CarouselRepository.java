package com.jianshu.demo.dao;

import com.jianshu.demo.domain.entity.Carousel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by lq on 2018/10/23.
 * 轮播图Repository接口
 */
public interface CarouselRepository extends JpaRepository<Carousel,Integer> {
}
