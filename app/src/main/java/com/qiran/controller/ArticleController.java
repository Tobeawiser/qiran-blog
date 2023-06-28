package com.qiran.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiran.base.BaseResponse;
import com.qiran.entity.Article;
import com.qiran.entity.User;
import com.qiran.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/list")
    public BaseResponse listByArticle(Page page, Article article) {
        IPage<Article> iPage = articleService.listByArticle(page, article);
        return BaseResponse.success(iPage);
    }


}
