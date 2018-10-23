package com.jianshu.demo.service.impl;


import com.jianshu.demo.dao.AuthorRepository;
import com.jianshu.demo.domain.entity.Author;
import com.jianshu.demo.domain.vo.IndexAuthorListVO;
import com.jianshu.demo.service.AuthorService;
import com.jianshu.demo.utils.ResponseUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lq on 2018/10/22.
 * 作者接口实现类
 */
@Service
public class AuthorServiceImpl implements AuthorService {
    @Resource
    private AuthorRepository authorRepository;


    /**
     * 根据作者的Id得到一个作者的信息
     * @param authorId
     * @return
     */
    @Override
    public ResponseUtil getOneAuthorByAuthorId(Integer authorId) {
        Author author = authorRepository.findAuthorByAuthorId(authorId);
        if (author != null){
            return new ResponseUtil(0,"OK",authorRepository.findAuthorByAuthorId(authorId));
        }else {
            return new ResponseUtil(0,"NO author");
        }
    }


    /**
     * 获得首页作者列表的视图
     * @return
     */
    @Override
    public ResponseUtil getIndexAuthorListVo() {
        List<Author> authorList = authorRepository.findAllAuthorByAuthorFavoriteCount();
        if (authorList.size() > 0 ){
            List<IndexAuthorListVO> authorListVOList = new ArrayList<>();
            for (Author author : authorList){
                IndexAuthorListVO authorListVO = new IndexAuthorListVO();
                authorListVO.setAuthorId(author.getAuthorId());
                authorListVO.setAuthorAvatar(author.getAuthorAvatar());
                authorListVO.setAuthorNickname(author.getAuthorNickname());
                authorListVO.setAuthorWordsCount(author.getAuthorWordsCount());
                authorListVO.setAuthorFavoriteCount(author.getAuthorFavoriteCount());
                authorListVOList.add(authorListVO);
            }
            return new ResponseUtil(0,"OK",authorListVOList);
        }else {
            return new ResponseUtil(0,"No author");
        }
    }
}
