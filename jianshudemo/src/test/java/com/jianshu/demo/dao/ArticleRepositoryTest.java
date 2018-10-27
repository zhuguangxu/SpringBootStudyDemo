package com.jianshu.demo.dao;

import com.jianshu.demo.domain.entity.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleRepositoryTest {
    @Resource
    private ArticleRepository articleRepository;
    @Test
    public void findArticleByArticleId() {
    }

    @Test
    public void findArticlesByTopicId() {
        List<Article> articleList = articleRepository.findArticlesByTopicId(1);
        System.out.println(articleList);

    }

    @Test
    public void findArticlesByAuthorId() {
    }
}