package com.jianshu.demo.service;


import com.jianshu.demo.utils.ResponseUtil;

/**
 * Created by zgx on 2018/10/22.
 * 文章的Service
 */
public interface ArticleService {


    /**
     * 根据文章的Id获得一篇文章的内容
     * @param articleId
     * @return
     */
    ResponseUtil getOneArticleByArticleId(Integer articleId);



    /**
     * 获得首页上的文章视图
     * @return
     */
    ResponseUtil getIndexArticleListVo();


    /**
     * 根据文章的Id获得文章详情
     * @param articleId
     * @return
     */
    ResponseUtil getOneArticleDetails(Integer articleId);
}
