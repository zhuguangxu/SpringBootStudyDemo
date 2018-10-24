package com.jianshu.demo.controller;

import com.jianshu.demo.domain.dto.GetAuthorDTO;
import com.jianshu.demo.service.AuthorService;
import com.jianshu.demo.utils.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by lq on 2018/10/22.
 * 作者的controller
 */
@RestController
@RequestMapping("/author")
@CrossOrigin("http://localhost")
public class AuthorController {
    @Resource
    private AuthorService authorService;

    @RequestMapping(value = "/indexRecommendAuthors", method = RequestMethod.GET)
    public ResponseUtil getIndexAuthorListVO(){
        return authorService.getIndexAuthorListVo();
    }

    @RequestMapping(value = "/oneAuthor", method = RequestMethod.POST)
    public ResponseUtil getOneAuthorByAuthorId(@RequestBody GetAuthorDTO getAuthorDTO){
        return authorService.getOneAuthorByAuthorId(getAuthorDTO.getAuthorId());
    }
}
