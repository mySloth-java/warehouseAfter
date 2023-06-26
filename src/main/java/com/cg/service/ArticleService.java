package com.cg.service;

import com.cg.entity.Article;
import com.cg.util.ResponseResult;

public interface ArticleService {

    ResponseResult AddArticle(Article article);

    ResponseResult UpdateArticle(Article article);

    ResponseResult DeleteArticle(String id);

    ResponseResult GetArticlePage(Integer pageNum, Integer pageSize, String name);
}
