package com.qiran.controller;

import com.qiran.entity.User;
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
        User list = articleController.list();
        Assert.assertNotNull(list);
        System.out.println(list);
    }
}