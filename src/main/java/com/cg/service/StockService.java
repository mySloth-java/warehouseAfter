package com.cg.service;

import com.cg.entity.Article;
import com.cg.entity.Stock;
import com.cg.util.ResponseResult;
import org.springframework.web.bind.annotation.RequestBody;

public interface StockService {
    ResponseResult PutStock(Article article,@RequestBody Stock stock);
}
