package com.qiran.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.qiran.entity.Article;
import com.qiran.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

    IPage<Article> listByArticle(IPage<Article> page, Article article);
}
