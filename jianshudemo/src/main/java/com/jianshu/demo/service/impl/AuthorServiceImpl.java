package com.jianshu.demo.service.impl;

import com.jianshu.demo.dao.ArticleRepository;
import com.jianshu.demo.dao.AuthorRepository;
import com.jianshu.demo.domain.entity.Article;
import com.jianshu.demo.domain.entity.Author;
import com.jianshu.demo.domain.vo.*;
import com.jianshu.demo.service.AuthorService;
import com.jianshu.demo.utils.ResponseUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zgx on 2018/10/22.
 * 作者接口实现类
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    @Resource
    private AuthorRepository authorRepository;
    @Resource
    private ArticleRepository articleRepository;

    /**
     * 根据作者的Id得到一个作者的信息
     * @param authorId
     * @return
     */
    @Override
    public ResponseUtil getOneAuthorByAuthorId(Integer authorId) {
        Author author = authorRepository.findAuthorByAuthorId(authorId);
        if (author != null){
            AuthorDetailsVO authorDetailsVO = new AuthorDetailsVO();
            AuthorDetailsAuthorVO authorDetailsAuthorVO = new AuthorDetailsAuthorVO();
            authorDetailsAuthorVO.setAuthorId(author.getAuthorId());
            authorDetailsAuthorVO.setAuthorAvatar(author.getAuthorAvatar());
            authorDetailsAuthorVO.setAuthorNickname(author.getAuthorNickname());
            authorDetailsAuthorVO.setAuthorDescription(author.getAuthorDescription());
            authorDetailsAuthorVO.setAuthorArticleCount(author.getAuthorArticleCount());
            authorDetailsAuthorVO.setAuthorFansCount(author.getAuthorFansCount());
            authorDetailsAuthorVO.setAuthorFavoriteCount(author.getAuthorFavoriteCount());
            authorDetailsAuthorVO.setAuthorFollowCount(author.getAuthorFollowCount());
            authorDetailsAuthorVO.setAuthorWordsCount(author.getAuthorWordsCount());
            List<Article> articleList = articleRepository.findArticlesByAuthorId(authorId);
            List<AuthorDetailsArticleListVO> authorDetailsArticleListVOList = new ArrayList<>();
            for (Article article : articleList){
                AuthorDetailsArticleListVO authorDetailsArticleListVO = new AuthorDetailsArticleListVO();
                authorDetailsArticleListVO.setArticleId(article.getArticleId());
                authorDetailsArticleListVO.setArticleTitle(article.getArticleTitle());
                authorDetailsArticleListVO.setArticleThumbnail(article.getArticleThumbnail());
                authorDetailsArticleListVO.setArticleSummary(article.getArticleSummary());
                authorDetailsArticleListVO.setArticleCommentCount(article.getArticleCommentCount());
                authorDetailsArticleListVO.setArticleLikeCount(article.getArticleLikeCount());
                authorDetailsArticleListVOList.add(authorDetailsArticleListVO);
            }
            authorDetailsVO.setAuthor(authorDetailsAuthorVO);
            authorDetailsVO.setAuthorDetailsArticleListVOList(authorDetailsArticleListVOList);
            return new ResponseUtil(0,"OK",authorDetailsVO);
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
            return new ResponseUtil(0,"No Author");
        }
    }

    @Override
    public ResponseUtil getAllAuthorListVo() {
        List<Author> authorList = authorRepository.findAll();
        if (authorList.size() != 0){
            List<AllAuthorListVO> authorListVOList = new ArrayList<>();
            for (Author author : authorList){
                AllAuthorListVO allAuthorListVO = new AllAuthorListVO();
                allAuthorListVO.setAuthorId(author.getAuthorId());
                allAuthorListVO.setAuthorAvatar(author.getAuthorAvatar());
                allAuthorListVO.setAuthorNickname(author.getAuthorNickname());
                allAuthorListVO.setAuthorDescription(author.getAuthorDescription());
                authorListVOList.add(allAuthorListVO);
            }
            return new ResponseUtil(0,"Ok",authorListVOList);
        }else {
            return new ResponseUtil(0,"No Author");
        }
    }
}
