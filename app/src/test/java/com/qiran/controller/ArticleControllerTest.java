package com.qiran.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiran.base.BaseResponse;
import com.qiran.entity.Article;
import com.qiran.mapper.ArticleMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ArticleControllerTest {
    @Autowired
    private ArticleController articleController;
    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void list() {
        Page page = new Page();
        page.setSize(10);
        page.setCurrent(2L);
        BaseResponse baseResponse = articleController.listByArticle(page, null);
        IPage iPage = baseResponse.getiPage();
        int size = iPage.getRecords().size();
        System.out.println("records-------------->size:" + size);
        Assert.assertNotNull(baseResponse);
        System.out.println(baseResponse);
    }

    @Test
    public void insert() throws InterruptedException {
        int i = RandomUtil.randomInt(20);
        for (int j = 0; j < i; j++) {
            String id = DateUtil.now().replace("-", "").replace(" ", "").replace(":", "");
            Thread.sleep(100 * 5);
            String title = DateUtil.now() + "title";
            Article article = new Article();
            article.setId(id);
            article.setTitle(title);
            try {
                articleMapper.insert(article);
            } catch (Exception e) {
                System.out.println("id 重复了，没关系，看下一条");
            }

        }


    }
}