package com.jiayu;

import com.jiayu.bean.Article;
import com.jiayu.dao.ArticleDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by ThinkPad on 2018/6/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BootApplication.class)
public class ArticleDaoTest {
    @Autowired
    private ArticleDao articleDao;

    @Test
    public void testInsert(){
        Article article = new Article();
        article.setTitle("测试标题");
        article.setSummary("测试摘要");
        article.setUserId(1L);
        article.setStatus(1);
        article.setCreateTime(new Date());
        article.setUpdateTime(new Date());
        article.setPublicTime(new Date());
        articleDao.insertArticle(article);
    }
}
