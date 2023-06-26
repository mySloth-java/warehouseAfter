package com.cg.mapper;


import com.cg.entity.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Article)表数据库访问层
 *
 * @author makejava
 * @since 2023-06-26 11:12:57
 */
@Mapper
public interface ArticleDao{
    int AddArticle(Article article);

}

