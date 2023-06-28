package com.qiran.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qiran.entity.Article;
import com.qiran.entity.User;


public interface ArticleService extends IService<Article> {

    IPage<Article> listByArticle(IPage<Article> page, Article article);

}
