package com.qiran.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qiran.dao.ArticleMapper;
import com.qiran.entity.User;
import com.qiran.service.ArticleService;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, User> implements ArticleService {


}
