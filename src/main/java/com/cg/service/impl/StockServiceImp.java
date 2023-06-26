package com.cg.service.impl;

import com.cg.dao.StockDao;
import com.cg.entity.Article;
import com.cg.entity.Stock;
import com.cg.service.StockService;
import com.cg.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImp implements StockService {
    @Autowired
    private StockDao stockDao;

    @Autowired
    //引入redis做消息队列
    private StringRedisTemplate stringRedisTemplate;


    @Override
    public ResponseResult PutStock(Article article, Stock stock) {
        //拿到商品唯一标识
        String articleId = article.getId();

        //入库，判断当前商品id在库是否存在，如果存在就是update，不存在就是insert

        Integer id = stockDao.AddStock(articleId, stock);
        //根据入库Id查询现存数量并返回
        stockDao.GetStock(id);



        return null;
    }
}
