package com.jiayu.dao.impl;

import com.jiayu.bean.Article;
import com.jiayu.dao.ArticleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ThinkPad on 2018/6/15.
 */
@Repository
public class ArticleDaoJdbcTempleImpl implements ArticleDao {

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public long insertArticle(Article article) {
        String sql = "insert into tb_article(title,summary,user_id,create_time,public_time,update_time,status,type) " +
                "values(:title,:summary,:userId,:createTime,:publicTime,:updateTime,:status,:type)";
        Map<String, Object> param = new HashMap<>();
        param.put("title", article.getTitle());
        param.put("summary", article.getSummary());
        param.put("userId", article.getUserId());
        param.put("status", article.getStatus());
        param.put("createTime", article.getCreateTime());
        param.put("publicTime", article.getPublicTime());
        param.put("updateTime", article.getUpdateTime());
        param.put("type",1);
        return (long) jdbcTemplate.update(sql, param);
    }
}
