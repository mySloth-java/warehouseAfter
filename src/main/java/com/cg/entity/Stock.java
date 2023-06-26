package com.cg.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * (Stock)表实体类
 *
 * @author makejava
 * @since 2023-06-26 16:36:37
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    //标识符号
    private Integer id;
    //商品标识符
    private String articleId;
    //入库时间
    private Date inTime;
    //出库时间
    private Date outTime;
    //流水
    private Float salary;
    //入库数量
    private Integer num;
    //门店
    private String shop;

}

