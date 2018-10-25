package com.jianshu.demo.dao;


import com.jianshu.demo.domain.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by zgx on 2018/10/22.
 * 作者Repository接口
 */
public interface AuthorRepository extends JpaRepository<Author,Integer> {

    /**
     * 根据作者账号查找一个作者的信息
     * @param account
     * @return
     */
    Author findAuthorByAccount(String account);


    /**
     * 根据作者的Id得到一个作者的信息
     * @param authorId
     * @return
     */
    Author findAuthorByAuthorId(Integer authorId);


    /**
     * 根据作者的喜欢数降序排列得到所有作者的信息
     * @return
     */
    @Query("FROM Author  a ORDER BY a.authorFavoriteCount DESC ")
    List<Author> findAllAuthorByAuthorFavoriteCount();
}
