package com.qiran.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qiran.entity.Article;
import com.qiran.mapper.ArticleMapper;
import com.qiran.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public IPage<Article> listByArticle(IPage<Article> page, Article article) {
        return articleMapper.listByArticle(page, article);
    }
}
