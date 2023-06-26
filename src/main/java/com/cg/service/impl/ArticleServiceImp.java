package com.cg.service.impl;

import com.cg.dao.ArticleDao;
import com.cg.entity.Article;
import com.cg.service.ArticleService;
import com.cg.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ArticleServiceImp implements ArticleService {
    @Autowired
    private ArticleDao articleDao;

    @Override
    public ResponseResult AddArticle(Article article) {
        int i = articleDao.AddArticle(article);
        //TODO 添加逻辑

        return ResponseResult.okResult(i);
    }
    @Override
    public ResponseResult UpdateArticle(Article article) {
        int i = articleDao.UpdateArticle(article);

        //TODO 添加逻辑
        return ResponseResult.okResult(i);
    }

    @Override
    public ResponseResult DeleteArticle(String id) {
        articleDao.DeleteArticle(id);
        return null;
    }

    @Override
    public ResponseResult GetArticlePage(Integer pageNum, Integer pageSize, String name) {
        pageNum = (pageNum - 1) * pageSize;

        List<Article> articles = articleDao.GetArticlePage(pageNum, pageSize, name);

        //查询总条数,此处传入的形参时配合分页查询，用来传入接受前端的搜索框数据
        Integer total = articleDao.ArticleCount(name);

        //创建Map集合存入分页查询数据和total返回
        Map<String,Object> result = new HashMap<>();
        result.put("data",articles);
        result.put("total",total);
        result.put("current",pageNum);
        result.put("size",pageSize);
        return ResponseResult.okResult(result);
    }
}
