package com.jianshu.demo.service;


import com.jianshu.demo.domain.dto.GetAuthorDTO;
import com.jianshu.demo.domain.entity.Author;
import com.jianshu.demo.utils.ResponseUtil;

/**
 * Created by lq on 2018/10/22.
 * 作者Service接口
 */
public interface AuthorService {

    /**
     * 根据某个属性查到一个作者的信息
     * @param  authorId
     * @return
     */
    ResponseUtil getOneAuthorByAuthorId(Integer authorId);

    /**
     * 得到首页上的作者列表视图
     * @return
     */
    ResponseUtil getIndexAuthorListVo();
}
