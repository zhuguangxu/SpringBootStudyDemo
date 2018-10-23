package com.jianshu.demo.controller;

import com.jianshu.demo.service.CarouselService;
import com.jianshu.demo.utils.ResponseUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by lq on 2018/10/23.
 * 轮播图controller
 */
@RestController
@RequestMapping("/carousel")
@CrossOrigin("http://localhost")
public class CarouselController {

    @Resource
    private CarouselService carouselService;

    @RequestMapping(value = "/allImg",method = RequestMethod.GET)
    public ResponseUtil getAllCarouselImg(){
        return carouselService.getAllCarouselImg();
    }
}
