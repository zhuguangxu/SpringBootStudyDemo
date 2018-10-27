package com.jianshu.demo.service.impl;

import com.jianshu.demo.dao.CarouselRepository;
import com.jianshu.demo.domain.entity.Carousel;
import com.jianshu.demo.service.CarouselService;
import com.jianshu.demo.utils.ResponseUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zgx on 2018/10/23.
 * 轮播图Service接口实现类
 */
@Service
public class CarouselServiceImpl implements CarouselService {

    @Resource
    private CarouselRepository carouselRepository;

    @Override
    public ResponseUtil getAllCarouselImg() {
        List<Carousel> carouselList = carouselRepository.findAll();
        if (carouselList.size() != 0){
            return new ResponseUtil(0,"OK",carouselList);
        }else {
            return new ResponseUtil(0,"No carousel img");
        }
    }
}
