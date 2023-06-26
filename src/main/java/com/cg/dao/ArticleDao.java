package com.cg.dao;


import com.cg.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (Article)表数据库访问层
 *
 * @author makejava
 * @since 2023-06-26 11:12:57
 */
@Mapper
public interface ArticleDao{
    int AddArticle(Article article);

    int UpdateArticle(Article article);

    int DeleteArticle(String id);

    List<Article> GetArticlePage(Integer pageNum, Integer pageSize, String name);
    Integer ArticleCount(String name);
}

