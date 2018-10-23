package com.jianshu.demo.service.impl;

import com.jianshu.demo.dao.ArticleRepository;
import com.jianshu.demo.dao.AuthorRepository;
import com.jianshu.demo.dao.TopicRepository;
import com.jianshu.demo.domain.entity.Article;
import com.jianshu.demo.domain.entity.Author;
import com.jianshu.demo.domain.entity.Topic;
import com.jianshu.demo.domain.vo.IndexArticleListVO;
import com.jianshu.demo.domain.vo.IndexTopicListVO;
import com.jianshu.demo.domain.vo.TopicDetailsAuthorListVO;
import com.jianshu.demo.service.TopicService;
import com.jianshu.demo.utils.ResponseUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lq on 2018/10/23.
 * 专题的Service实现类
 */
@Service
public class TopicServiceImpl implements TopicService {


    @Resource
    private TopicRepository topicRepository;
    @Resource
    private AuthorRepository authorRepository;
    @Resource
    private ArticleRepository articleRepository;

    @Override
    public ResponseUtil getOneTopicDetails(Integer topicId) {
        //首先获得详情页中的topic信息
        Topic topic = topicRepository.findTopicByTopicId(topicId);
        if (topic != null) {
            //其次获得这个专题下的文章列表
            List<Article> articleList = articleRepository.findArticlesByTopicId(topicId);
            if (articleList.size() != 0) {
                List<IndexArticleListVO> articleListVOList = new ArrayList<>();
                List<TopicDetailsAuthorListVO> authorListVOList = new ArrayList<>();
                for (Article article : articleList) {
                    Author author = authorRepository.findAuthorByAuthorId(article.getAuthorId());
                    TopicDetailsAuthorListVO topicDetailsAuthorListVO =
                            new TopicDetailsAuthorListVO(author.getAuthorId(), author.getAuthorAvatar());

                }
            } else {
                return new ResponseUtil(0, "this topic no article");
            }
        } else {
            return new ResponseUtil(0, "NO topic");
        }
    }

    @Override
    public ResponseUtil getAllTopics() {
        List<Topic> topicList = topicRepository.findAll();
        if (topicList.size() != 0){
            return new ResponseUtil(0,"Ok",topicList);
        }else {
            return new ResponseUtil(0,"No topic");
        }
    }

    @Override
    public ResponseUtil getIndexTopicListVo() {
        List<Topic> topicList = topicRepository.findAll();
        if (topicList.size() != 0){
            List<IndexTopicListVO> indexTopicListVOList = new ArrayList<>();
            for (Topic topic : topicList){
                IndexTopicListVO indexTopicListVO = new IndexTopicListVO();
                indexTopicListVO.setTopicId(topic.getTopicId());
                indexTopicListVO.setTopicTitle(topic.getTopicTitle());
                indexTopicListVO.setTopicAvatar(topic.getTopicAvatar());
                indexTopicListVOList.add(indexTopicListVO);
            }
            return new ResponseUtil(0,"Ok",indexTopicListVOList);
        }else {
            return new ResponseUtil(0,"No topic");
        }
    }
}
