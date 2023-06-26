package com.cg.controller;

import com.cg.entity.Article;
import com.cg.service.ArticleService;
import com.cg.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    //新增加商品
    @PostMapping
    public ResponseResult AddArticle(@RequestBody Article article){
        return articleService.AddArticle(article);
    }

    //修改商品
    @PutMapping
    public ResponseResult UpdateArticle(@RequestBody Article article){
        return articleService.UpdateArticle(article);
    }

    //删除商品
    @DeleteMapping("/{id}")
    public ResponseResult DeleteArticle(@PathVariable("id") String id){
        return articleService.DeleteArticle(id);
    }

    //查询商品  分页查询  商品名称、查询页、每页大小
    @GetMapping
    public ResponseResult GetArticlePage(@RequestParam Integer pageNum,
                                         @RequestParam Integer pageSize,
                                         @RequestParam String name){
        return articleService.GetArticlePage(pageNum,pageSize,name);
    }


}
