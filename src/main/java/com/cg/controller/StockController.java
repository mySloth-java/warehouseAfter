package com.cg.controller;

import com.cg.entity.Article;
import com.cg.entity.Stock;
import com.cg.service.StockService;
import com.cg.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    private StockService stockService;

    //入库
    @PostMapping
    public ResponseResult PutStock(Article article, Stock stock){
        return stockService.PutStock(article,stock);
    }

    //出库
//    @DeleteMapping
//    public ResponseResult OutStock(){
//        return stockService.OutStock();
//    }

    //商品入库流水查询
//    @GetMapping
//    public ResponseResult SalaryStock(){
//        return stockService.SalaryStock();
//    }

}
