package com.jianshu.demo.controller;


import com.jianshu.demo.domain.dto.GetArticleDTO;
import com.jianshu.demo.service.ArticleService;
import com.jianshu.demo.utils.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by zgx on 2018/10/22.
 * 文章controller
 */
@RestController
@RequestMapping("/article")
@CrossOrigin("http://localhost")
public class ArticleController {


    @Resource
    private ArticleService articleService;

    @RequestMapping(value = "/hotArticles",method = RequestMethod.GET)
    public ResponseUtil getIndexArticleListVO(){
        return articleService.getIndexArticleListVo();
    }


    @RequestMapping(value = "/oneArticleDetails",method = RequestMethod.POST)
    public ResponseUtil getOneArticleDetails(@RequestBody GetArticleDTO getArticleDTO){
        return articleService.getOneArticleDetails(getArticleDTO.getArticleId());
    }
}
