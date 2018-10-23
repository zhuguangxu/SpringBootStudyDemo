package com.jianshu.demo.service.impl;


import com.jianshu.demo.dao.ArticleRepository;
import com.jianshu.demo.dao.AuthorRepository;
import com.jianshu.demo.domain.entity.Article;
import com.jianshu.demo.domain.entity.Author;
import com.jianshu.demo.domain.vo.ArticleInfoVO;
import com.jianshu.demo.domain.vo.IndexArticleListVO;
import com.jianshu.demo.service.ArticleService;
import com.jianshu.demo.utils.ResponseUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by lq on 2018/10/22.
 * 文章Service实现类
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleRepository articleRepository;

    @Resource
    private AuthorRepository authorRepository;

    @Override
    public ResponseUtil getOneArticleByArticleId(Integer articleId) {
        Article article = articleRepository.findArticleByArticleId(articleId);
        if (article != null){
            return new ResponseUtil(0,"Ok",article);
        }else {
            return new ResponseUtil(0,"No article");
        }
    }

    @Override
    public ResponseUtil getIndexArticleListVo() {
        List<Article> articleList = articleRepository.findAll();
        List<IndexArticleListVO> articleListVOList = new ArrayList<>();
        if (articleList.size() != 0 ){
            for (Article article : articleList){
                Integer authorId = article.getAuthorId();
                Author author = authorRepository.findAuthorByAuthorId(authorId);
                IndexArticleListVO indexArticleListVO = new IndexArticleListVO();
                indexArticleListVO.setArticleId(article.getArticleId());
                indexArticleListVO.setAuthorId(authorId);
                indexArticleListVO.setAuthorNickname(author.getAuthorNickname());
                indexArticleListVO.setArticleTitle(article.getArticleTitle());
                indexArticleListVO.setArticleThumbnail(article.getArticleThumbnail());
                indexArticleListVO.setArticleSummary(article.getArticleSummary());
                indexArticleListVO.setArticleCommentCount(article.getArticleCommentCount());
                indexArticleListVO.setArticleLikeCount(article.getArticleLikeCount());
                articleListVOList.add(indexArticleListVO);
            }
            return new ResponseUtil(0,"OK",articleListVOList);
        }else {
            return new ResponseUtil(0,"NO article");
        }
    }

    @Override
    public ResponseUtil getOneArticleDetails(Integer articleId) {
        Article article = articleRepository.findArticleByArticleId(articleId);
        if (article != null){
            ArticleInfoVO articleInfoVO = new ArticleInfoVO();
            Author author = authorRepository.findAuthorByAuthorId(article.getAuthorId());
            articleInfoVO.setArticle(article);
            articleInfoVO.setAuthorAvatar(author.getAuthorAvatar());
            articleInfoVO.setAuthorNickname(author.getAuthorNickname());
            return new ResponseUtil(0,"Ok",articleInfoVO);
        }else {
            return new ResponseUtil(0,"No article");
        }
    }
}
