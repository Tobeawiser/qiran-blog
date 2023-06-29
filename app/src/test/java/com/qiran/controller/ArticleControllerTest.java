package com.qiran.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiran.base.BaseResponse;
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
        BaseResponse baseResponse = articleController.listByArticle(new Page(), null);
        IPage iPage = baseResponse.getiPage();
        int size = iPage.getRecords().size();
        System.out.println("records-------------->size:" + size);
        Assert.assertNotNull(baseResponse);
        System.out.println(baseResponse);
    }
}