package com.cg.warehouseafter.entity;


import lombok.Data;

/**
 * (Article)表实体类
 *
 * @author makejava
 * @since 2023-06-26 11:09:51
 */
@SuppressWarnings("serial")
@Data
public class Article {
    //标识
    private String id;
    //商品名称
    private String name;
    //规格
    private String type;
    //单价
    private Object price;
}

