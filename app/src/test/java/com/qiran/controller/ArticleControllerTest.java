package com.qiran.controller;

import com.qiran.base.BaseResponse;
import com.qiran.entity.Article;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArticleControllerTest {
    @Autowired
    private ArticleController articleController;

    @Test
    public void list() {
        BaseResponse baseResponse = articleController.listByArticle(null, null);
        Assert.assertNotNull(baseResponse);
        System.out.println(baseResponse);
    }
}