package com.cg.dao;

import com.cg.entity.Stock;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StockDao {
    Integer AddStock(@Param("articleId") String articleId, Stock stock);

    Integer UpdateStock(@Param("articleId") String articleId, Stock stock);

    Integer GetStock(Integer id);
}
